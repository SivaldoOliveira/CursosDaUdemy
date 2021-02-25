using System;
using System.Windows.Forms;
using System.Data.OleDb;

namespace Registration
{
    public partial class Form1 : Form
    {
       
#region "Declaração"
        /*Declara variaveis de conexão*/
        //pega o banco de dados da pasta : bin/debug
        //public string constring = "Provider=Microsoft.Jet.OLEDB.4.0;" + "Data Source=" + Application.StartupPath + "/Funcionarios.mdb" + ";Persist Security Info=False";
        //pega da pasta c:\dados
        public string constring = "Provider=Microsoft.Jet.OLEDB.4.0;" + "Data Source=" + "c:/dados/Funcionarios.mdb" + ";Persist Security Info=False";
        Boolean estado = false;
        #endregion

        public Form1()
        {
            InitializeComponent();
        }
   
#region "Preenche datagrid"
        //preecnher dados no listview
        public void preencheListView(string strSql, string tstr)
        {
            listView1.Items.Clear();
            listView1.Sorting = SortOrder.Ascending;
            try
            {
                OleDbConnection con = new OleDbConnection(constring);
                OleDbCommand com1 = new OleDbCommand(strSql, con);
                con.Open();
                OleDbDataReader datareader;
                datareader = com1.ExecuteReader();
                while (datareader.Read())
                {
                    ListViewItem lvitem = new ListViewItem(datareader[0].ToString());
                    for (int i = 1; i <= datareader.FieldCount - 1; i++)
                    {
                        lvitem.SubItems.Add(datareader[i].ToString());
                    }
                    listView1.Items.Add(lvitem);
                }
                con.Close();
            }
            catch (Exception err) { MessageBox.Show(err.ToString()); }
        }
     
        private void preencheTexto(string strSql, string tstr)
        {
            OleDbConnection con = new OleDbConnection(constring);
            OleDbCommand com1 = new OleDbCommand(strSql, con);
            con.Open();
            OleDbDataReader datareader;
            datareader = com1.ExecuteReader();
            datareader.Read();
            {
                txtcodigo.Text = datareader["Codigo"].ToString();
                txtnome.Text = datareader["Nome"].ToString();
                txtendereco.Text = datareader["Endereco"].ToString();
                txtfone.Text = datareader["Telefone"].ToString();
                txtsalario.Text = datareader["Salario"].ToString();
                txtadmissao.Text = datareader["Admissao"].ToString();

            }
            datareader.Close();
            con.Close();
        }
        private void desabilita(bool a)
        {
            txtcodigo.Enabled = a;
            txtnome.Enabled = a;
            txtendereco.Enabled = a;
            txtfone.Enabled = a;
            txtsalario.Enabled = a;
            txtadmissao.Enabled = a;
        }
        #endregion

#region "inserir salvar deletar registro"
        private void salvaRegistro()
        {
            OleDbConnection salvaConn = new OleDbConnection(constring);
            OleDbCommand salvaCmd = new OleDbCommand("insert into Funcionarios values (?,?,?,?,?,?)", salvaConn);
            OleDbParameter param;
            param = salvaCmd.Parameters.Add("@funcicode", OleDbType.VarChar, 10);
            param.Value = txtcodigo.Text;
            param = salvaCmd.Parameters.Add("@funcinome", OleDbType.VarChar, 25);
            param.Value = txtnome.Text;
            param = salvaCmd.Parameters.Add("@funciend", OleDbType.VarChar, 50);
            param.Value = txtendereco.Text;
            param = salvaCmd.Parameters.Add("@funcifone", OleDbType.VarChar, 20);
            param.Value = txtfone.Text;
            param = salvaCmd.Parameters.Add("@funcisal", OleDbType.VarChar, 7);
            param.Value = txtsalario.Text;
            param = salvaCmd.Parameters.Add("@funciadm", OleDbType.Date);
            try{
            salvaConn.Open();
            int rows = salvaCmd.ExecuteNonQuery();
            MessageBox.Show(rows.ToString() + " linhas afetadas");
            btnRef.PerformClick();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
            finally
            {
                salvaConn.Close();
            }
        }
        private void atualizaRegistro()
        {
            OleDbConnection atualizaConn = new OleDbConnection(constring);
            OleDbCommand atualizaCmd = new OleDbCommand("Update Funcionarios set Nome=?, Endereco=?, Telefone=?, Salario=?, Admissao=?" + "where Codigo=?",atualizaConn);
            OleDbParameter param;
            param = atualizaCmd.Parameters.Add("@funcinome", OleDbType.VarChar, 25);
            param.Value = txtnome.Text;
            param = atualizaCmd.Parameters.Add("@funciende", OleDbType.VarChar, 50);
            param.Value = txtendereco.Text;
            param = atualizaCmd.Parameters.Add("@funcifone", OleDbType.VarChar, 20);
            param.Value = txtfone.Text;
            param = atualizaCmd.Parameters.Add("@funcisal", OleDbType.VarChar, 7);
            param.Value = txtsalario.Text;
            param = atualizaCmd.Parameters.Add("@funciadm", OleDbType.Date);
            param.Value = DateTime.Now.ToShortDateString();
            param = atualizaCmd.Parameters.Add("@funcicode", OleDbType.VarChar, 10);
            param.Value = txtcodigo.Text;
            try
            {
                atualizaConn.Open();
                int rowss = atualizaCmd.ExecuteNonQuery();
                MessageBox.Show(rowss.ToString() + "linhas afetadas");
                btnRef.PerformClick();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
            finally
            {
                atualizaConn.Close();
            }
        }
        private void deletaRegistro() 
        {
            OleDbConnection deletaConn = new OleDbConnection(constring);
            OleDbCommand deletaCmd = new OleDbCommand("Delete from Funcionarios where Codigo='" + txtcodigo.Text + "'", deletaConn);
            try
            {
                deletaConn.Open();
                int rows = deletaCmd.ExecuteNonQuery();
                MessageBox.Show(rows.ToString() + " linhas Deletadas");
                btnRef.PerformClick();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
            finally
            {
                deletaConn.Close();
            }
        }
        #endregion

        //private void toolStripButton14_Click(object sender, EventArgs e)
        //{//close the form
        //    this.Close();
        //}
        //private void toolStripButton6_Click(object sender, EventArgs e)
        //{
        //    desabilita(false);
        //    try
        //    {
        //        string str = "Select * from Funcionarios order by Codigo";
        //        string tstr = "Funcionarios";
        //        preencheListView(str, tstr);
        //        preencheTexto(str, tstr);
        //        cboProcurar.SelectedIndex = 0;
        //    }
        //    catch (Exception er) { MessageBox.Show(er.ToString()); }
        //}
        private void Form1_Load(object sender, EventArgs e)
        {
            //preenche o ListView com os dados no evento Load
            //chamando a função preencheListView e PreencheTexto que definimos anteriormente
            desabilita(false);
            try
            {
                string strSQL = "Select * from Funcionarios order by Codigo";
                string tstr = "Funcionarios";
                preencheListView(strSQL, tstr);
                preencheTexto(strSQL, tstr);
                cboProcurar.SelectedIndex = 0;
            }
            catch (Exception err) { MessageBox.Show(err.ToString()); }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            //procura os dados que você preencheu no  text box e selecionou no criterio da combo
            try
            {
                //string cbtexto = cboProcurar.Text;
                string strSQL = "Select * from Funcionarios " + "where " + cboProcurar.Text + " like'%" + txtCriterio.Text + "%'";
                string tstr = "Funcionarios";
                preencheListView(strSQL, tstr);
                //preencheTexto(strSQL, tstr, cbtext);
            }
            catch (Exception err) { MessageBox.Show(err.ToString()); }
        }

        private void btnIncluir_Click(object sender, EventArgs e)
        {
            label10.Visible = true;
            label10.Text = "Incluindo Registros";
            desabilita(true);
            txtadmissao.Enabled = false;
            txtadmissao.Text = DateTime.Now.ToShortDateString();
            txtcodigo.Text = "";
            txtnome.Text = "";
            txtendereco.Text = "";
            txtfone.Text = "";
            txtsalario.Text = "";
            txtcodigo.Focus();
        }

        private void btnEditar_Click(object sender, EventArgs e)
        {
            label10.Visible = true;
            label10.Text = "Editando Registro: Primeiro clique no Registro da lista que voce quer Editar e depois faça as alterações e clique no botão Salvar";
            estado = true;
            desabilita(true);
            txtadmissao.Enabled = false;
            txtadmissao.Text = DateTime.Now.ToShortDateString();
        }

        private void btnref_Click(object sender, EventArgs e)
        {
            desabilita(false);
            label10.Text = "";
            try
            {
                string str = "Select * from Funcionarios order by Codigo";
                string tstr = "Funcionarios";
                preencheListView(str, tstr);
                preencheTexto(str, tstr);
                cboProcurar.SelectedIndex = 0;
            }
            catch (Exception er) { MessageBox.Show(er.ToString()); }
        }

        private void btnFechar_Click(object sender, EventArgs e)
        {
            //fecha o formulário
            DialogResult dlgResult = MessageBox.Show("Deseja encerrar a aplicação ?", "Encerrar ?", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (dlgResult == DialogResult.Yes)
            {
                this.Close();
            }
        }

        private void btnDeletar_Click(object sender, EventArgs e)
        {
            //fecha o formulário
            DialogResult dlgResult = MessageBox.Show("Deseja deletar o funcionário : " + txtnome.Text , "Encerrar ?", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (dlgResult == DialogResult.Yes)
            {
                deletaRegistro();
            }
        }

        private void btnSalvar_Click(object sender, EventArgs e)
        {
            if (estado == false)
            {
                salvaRegistro();
            }
            else 
            { 
                atualizaRegistro();
            }
        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {
            txtcodigo.Text = (listView1.Items[listView1.FocusedItem.Index].SubItems[0].Text);
            txtnome.Text = (listView1.Items[listView1.FocusedItem.Index].SubItems[1].Text);
            txtendereco.Text = (listView1.Items[listView1.FocusedItem.Index].SubItems[2].Text);
            txtfone.Text = (listView1.Items[listView1.FocusedItem.Index].SubItems[3].Text);
            txtsalario.Text = (listView1.Items[listView1.FocusedItem.Index].SubItems[4].Text);
            txtadmissao.Text = (listView1.Items[listView1.FocusedItem.Index].SubItems[5].Text);
        }
    }
}