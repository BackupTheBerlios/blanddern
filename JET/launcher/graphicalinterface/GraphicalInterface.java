package graphicalinterface;

import java.awt.Frame;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;

/**
 * 
 * @author Jérémie SCHEER & Loïc SUTTER
 *
 */
public class GraphicalInterface extends javax.swing.JDialog {
    
	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFileChooser jFileChooser3;
    private javax.swing.JFileChooser jFileChooser4;
    private javax.swing.JFileChooser jFileChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
  
    private String workspaceDirectory;
    private List paths;
    private int currentLoad;
	
    /** Creates new form Adaptor */
    public GraphicalInterface(String workspaceDirectory) {
    	super((Frame)null,"",true);
        this.workspaceDirectory = workspaceDirectory;
        paths = new ArrayList();
        initComponents();
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(true);
        currentLoad = 0;
    }
    
    
    /** This method initialize all components */
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jFileChooser3 = new javax.swing.JFileChooser();
        jFileChooser4 = new javax.swing.JFileChooser();
        jFileChooser5 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.setDialogTitle("Adaptor model path");
        jFileChooser1.setFileFilter(new FileFilterSelection(new String[]{"adaptor"},"Adaptor file (*.adaptor)"));

        jFileChooser2.setDialogTitle("Source model path");

        jFileChooser3.setAcceptAllFileFilterUsed(false);
        jFileChooser3.setDialogTitle("Genmodel path of the target metamodel");
        jFileChooser3.setFileFilter(new FileFilterSelection(new String[]{"genmodel"},"Genmodel file (*.genmodel)"));

        jFileChooser4.setDialogTitle("Binary directory of the metamodel source");
        jFileChooser4.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        jFileChooser5.setDialogTitle("Binary directory of the target metamodel");
        jFileChooser5.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Initialize variables");
        setResizable(false);

        jLabel1.setText("Adaptor model path :");

        jTextField1.setEditable(false);

        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Source model path :");

        jTextField2.setEditable(false);

        jButton2.setText("Load");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Genmodel path of the target metamodel :");

        jTextField3.setEditable(false);

        jButton3.setText("Load");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Bin directories path of the source metamodel :");

        jTextField4.setEditable(false);

        jButton4.setText("Load");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Please, give information about all the paths which are ask to initialize correctly variables");

        jLabel6.setText("Bin directories path of the target metamodel :");

        jTextField5.setEditable(false);

        jButton5.setText("Load");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Ok");
        jButton6.setMaximumSize(new java.awt.Dimension(69, 23));
        jButton6.setMinimumSize(new java.awt.Dimension(69, 23));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText(" ");

        jButton8.setText("Previous load");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        
        jButton9.setText("Next load");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(485, 485, 485))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton7)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap())
        );

        pack();
    }

                             
//This method is called when a click is detected on the first load button
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   jFileChooser1.setCurrentDirectory(new File(workspaceDirectory));
   int res = jFileChooser1.showOpenDialog(this);
   if(res==JFileChooser.APPROVE_OPTION){
        String path = jFileChooser1.getSelectedFile().getAbsolutePath();
        File f = new File(path);
        if(f.exists()){
            jLabel7.setText(" "); 
            jTextField1.setText(path);
            jButton2.setEnabled(true);
            jButton8.setEnabled(true);
            jButton1.setEnabled(false);
            currentLoad++;
            paths.add(0, path);
        }else{
            jLabel7.setText("The file " + path + " does not exists !");
        }
   }
}                                        

//This method is called when a click is detected on the second load button
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    jFileChooser2.setCurrentDirectory(new File(workspaceDirectory));
   int res = jFileChooser2.showOpenDialog(this);
   if(res==JFileChooser.APPROVE_OPTION){
        String path = jFileChooser2.getSelectedFile().getAbsolutePath();
        File f = new File(path);
        if(f.exists()){
            jLabel7.setText(" ");
            jTextField2.setText(path);
            jButton3.setEnabled(true);
            jButton8.setEnabled(true);
            jButton2.setEnabled(false);
            currentLoad++;
            paths.add(1,path);
        }else{
            jLabel7.setText("The file " + path + " does not exists !");
        }
   }
} 

//This method is called when a click is detected on the third load button
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	jFileChooser3.setCurrentDirectory(new File(workspaceDirectory));
	   int res = jFileChooser3.showOpenDialog(this);
	   if(res==JFileChooser.APPROVE_OPTION){
	       String path = jFileChooser3.getSelectedFile().getAbsolutePath();
	       File f = new File(path);
	        if(f.exists()){
	            jLabel7.setText(" ");
	            jTextField3.setText(path);
	            jButton4.setEnabled(true);
	            jButton8.setEnabled(true);
	            jButton3.setEnabled(false);
	            currentLoad++;
	            paths.add(2,path);
	        }else{
	           jLabel7.setText("The file " + path + " does not exists !");
	        }
	   }
	}

//This method is called when a click is detected on the fourth load button
private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    jFileChooser4.setCurrentDirectory(new File(workspaceDirectory));
   int res = jFileChooser4.showOpenDialog(this);
   if(res==JFileChooser.APPROVE_OPTION){
        String path = jFileChooser4.getSelectedFile().getAbsolutePath();
        File f = new File(path);
        if(f.exists()){
            jLabel7.setText(" ");
            jTextField4.setText(path);
            jButton5.setEnabled(true);
            jButton8.setEnabled(true);
            jButton4.setEnabled(false);
            currentLoad++;
            paths.add(3,path);
        }else{
            jLabel7.setText("The folder " + path + " does not exists !");
        }
   }
}                                        
                                        
//This method is called when a click is detected on the fifth load button
private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	jFileChooser5.setCurrentDirectory(new File(workspaceDirectory));
   int res = jFileChooser5.showOpenDialog(this);
   if(res==JFileChooser.APPROVE_OPTION){
        String path = jFileChooser5.getSelectedFile().getAbsolutePath();
        File f = new File(path);
        if(f.exists()){
            jLabel7.setText(" ");
            jTextField5.setText(path);
            jButton6.setEnabled(true);
            jButton8.setEnabled(true);
            jButton5.setEnabled(false);
            currentLoad++;
            paths.add(4,path);
        }else{
            jLabel7.setText("The folder " + path + " does not exists !");
        }
   }
}                                        

//This method is called when a click is detected on the ok button
private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
	if(!jTextField1.getText().equals("") && !jTextField2.getText().equals("") && !jTextField3.getText().equals("") && !jTextField4.getText().equals("") && !jTextField5.getText().equals("")){
		this.dispose();
	}else{
		jLabel7.setText("All the field must be filled");
	}	
}

//This method is called when a click is detected on the cancel button
private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    paths = new ArrayList();
    this.dispose();
}

//This method is called when a click is detected on the previous load button
private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
	switch(currentLoad){
	case 1:jButton2.setEnabled(false);jButton1.setEnabled(true);jButton8.setEnabled(false);currentLoad--;break;
	case 2:jButton3.setEnabled(false);jButton2.setEnabled(true);currentLoad--;break;
	case 3:jButton4.setEnabled(false);jButton3.setEnabled(true);currentLoad--;break;
	case 4:jButton5.setEnabled(false);jButton4.setEnabled(true);jButton9.setEnabled(true);currentLoad--;break;
	case 5:jButton5.setEnabled(true);currentLoad--;break;
	}
	
}

//This method is called when a click is detected on the next load button
private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
	switch(currentLoad){
	case 0:jButton1.setEnabled(false);jButton2.setEnabled(true);jButton8.setEnabled(true);currentLoad++;break;
	case 1:jButton2.setEnabled(false);jButton3.setEnabled(true);currentLoad++;break;
	case 2:jButton3.setEnabled(false);jButton4.setEnabled(true);currentLoad++;break;
	case 3:jButton4.setEnabled(false);jButton5.setEnabled(true);jButton6.setEnabled(true);jButton9.setEnabled(false);currentLoad++;break;
	}
}

public List getPaths(){
    return this.paths;
}
   
}
