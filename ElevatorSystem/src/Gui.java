import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Gui.java
 *
 * Created on May 8, 2010, 8:13:23 AM
 */

/**
 *
 * @author athuluru
 */
public class Gui extends javax.swing.JFrame {

    
	
	/** Creates new form Gui */
    public Gui() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        
        //****************** Newly add label *****************//
        jComboBox12 = new javax.swing.JComboBox();
        jComboBox13 = new javax.swing.JComboBox();
        jComboBox14 = new javax.swing.JComboBox();
        jComboBox15 = new javax.swing.JComboBox();
        jComboBox16 = new javax.swing.JComboBox();
        //***********************************************//
        
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jAlarmLabel = new javax.swing.JLabel();
        
        //****************** Newly add label *****************//
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        //***********************************************//
       
        
        
        jComboBox10 = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        Authors = new javax.swing.JMenu();
        setjMenuItem2(new javax.swing.JMenuItem());
        jMenuItem1 = new javax.swing.JMenuItem();
        jAlarmComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.controlHighlight);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel1.setText("Elevator System");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", " " }));
        
        //*************** Newly add ***************//
        jComboBox2.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
                int k=0;
                jLabel12.setVisible(false);
                jLabel13.setVisible(false);
                jLabel14.setVisible(false);
                jLabel15.setVisible(false);
                jLabel16.setVisible(false);
                
                jComboBox12.setVisible(false);
                jComboBox13.setVisible(false);
                jComboBox14.setVisible(false);
                jComboBox15.setVisible(false);
                jComboBox16.setVisible(false);
                
                for(int i=0; i<Integer.parseInt(jComboBox2.getSelectedItem().toString()); i++){
                	 jLabel12.setVisible(true);
                	 jComboBox12.setVisible(true);if(i==0) {continue;}
                     jLabel13.setVisible(true);
                     jComboBox13.setVisible(true);if(i==1) {continue;}
                     jLabel14.setVisible(true);
                     jComboBox14.setVisible(true);if(i==2) {continue;}
                     jLabel15.setVisible(true);
                     jComboBox15.setVisible(true);if(i==3) {continue;}
                     jLabel16.setVisible(true);
                     jComboBox16.setVisible(true);if(i==4) {continue;}
                	
                }
                jComboBox12ActionPerformed(evt);
            }
        });
        
        //
        
        //****************** Newly add label *****************//
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Odd", "Even"}));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Odd", "Even"}));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });
        
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Odd", "Even"}));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });
        
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Odd", "Even"}));
        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox15ActionPerformed(evt);
            }
        });
        
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Odd", "Even"}));
        jComboBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox16ActionPerformed(evt);
            }
        });
        
        //
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single Door", "Double Door", "Alternate Single/Double Door" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Green", "Blue", "Red", "Yellow" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blue", "Green", "Red", "Yellow" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blue", "Green", "Red", "Yellow" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blue", "Green", "Red", "Yellow", " " }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Text", "Symbol" }));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Text", "Symbol" }));
        
      
        jLabel2.setText("Number of Floors");

        jLabel3.setText("Number of Cars");
        
        //****************** Newly add label *****************//
        jLabel12.setText("Car 1:");
        jLabel13.setText("Car 2:");
        jLabel14.setText("Car 3:");
        jLabel15.setText("Car 4:");
        jLabel16.setText("Car 5:");
        //*********************************************//

        jLabel4.setText("Door Configuration");

        jLabel5.setText("User Panel Color");

        jLabel6.setText("User Panel Pressed Button Color");

        jLabel7.setText("Floor Panel Color");

        jLabel8.setText("Floor Panel Pressed Button Color");

        jLabel9.setText("Floor Panel Display");

        jLabel10.setText("Door Panel Display");

        jButton2.setText("Show ELevator");
        
        jButton2.addActionListener(new ShowElevator());

        jLabel11.setText("Algorithm Type");
        
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shortest Path", "Random", "FIFO" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });
        
        jAlarmLabel.setText("Alarm Display");
        
        jAlarmComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Red Flashing", "Red non Flashing" }));
        jAlarmComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlarmComboBoxActionPerformed(evt);
            }
        });
        
        jMenuItem1.addActionListener(new Authors());

        Authors.setBackground(java.awt.SystemColor.control);
        Authors.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        Authors.setText("About");
        Authors.setFont(new java.awt.Font("Times New Roman", 0, 12));

       /* jMenuItem2.setText("Elevator System");
        Authors.add(jMenuItem2);
*/
        jMenuItem1.setText("Authors");
        Authors.add(jMenuItem1);

        jMenuBar1.add(Authors);

        setJMenuBar(jMenuBar1);
        
        
        //*********************** Newly add *******************//
        
        jLabel12.setVisible(true);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        
        jComboBox12.setVisible(true);
        jComboBox13.setVisible(false);
        jComboBox14.setVisible(false);
        jComboBox15.setVisible(false);
        jComboBox16.setVisible(false);
        //****************************************************//

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    
                    //****************** Newly add label *****************//
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    //***********************************************//
                    
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jAlarmLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    
                    //****************** Newly add label *****************//
                    .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)//new
                    .addComponent(jComboBox13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)//new
                    .addComponent(jComboBox14, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)//new
                    .addComponent(jComboBox15, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)//new
                    .addComponent(jComboBox16, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)//new                               
                    //***********************************************//
                    
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAlarmComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        //****************** Newly add label *****************//                     
                        //.addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)//new
                       /* .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)//new
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)//new
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)//new
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)//new
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)//new
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)//new
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)//new
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)//new
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)//new
                        *///
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        //****************** Newly add label *****************//
                        //.addComponent(jLabel12)//new
                        //.addGap(15, 15, 15)
                        //.addComponent(jLabel13)//new
                        //.addGap(15, 15, 15)
                        //.addComponent(jLabel14)//new
                        //.addGap(15, 15, 15)
                        //.addComponent(jLabel15)//new
                       // .addGap(15, 15, 15)
                       // .addComponent(jLabel16)//new
                       // .addGap(15, 15, 15)
                        //***********************************************//
                        .addComponent(jLabel4)
                        ))
                 //new add 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                    
                 //new add//
                    
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAlarmLabel)
                    .addComponent(jAlarmComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(29, 29, 29))
        );
        
        pack();
    }// </editor-fold>

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }     

    private void jAlarmComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }     

    //*************************** Newly add **************************//
        
    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }  
    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }  
    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }  
    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }  
    private void jComboBox16ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }  
    
    //*****************************************************************//
    
    class ShowElevator implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			String numFloors = (String)jComboBox1.getSelectedItem();
			GuiConfiguration.setNumOfFloors(Integer.parseInt(numFloors));
			
			String numCars = (String)jComboBox2.getSelectedItem();
			GuiConfiguration.setNumOfCars(Integer.parseInt(numCars));
			
			String doorConfig = (String)jComboBox3.getSelectedItem();
			GuiConfiguration.setDoorConfiguration(doorConfig.toString());
			
			String usrPnlColor = (String)jComboBox4.getSelectedItem();
			GuiConfiguration.setUserPanelColor(usrPnlColor.toString());
			
			String usrPnlBtnPressedColor = (String)jComboBox5.getSelectedItem();
			GuiConfiguration.setUserPanelPressedButtonColor(usrPnlBtnPressedColor.toString());
			
			String flrPnlClr = (String)jComboBox6.getSelectedItem();
			GuiConfiguration.setFloorPanelColor(flrPnlClr.toString());
			
			String flrPnlPressedBtnColor = (String)jComboBox7.getSelectedItem();
			GuiConfiguration.setFloorPanelPressedButtonColor(flrPnlPressedBtnColor.toString());
			
			String flrPnlDisplay = (String)jComboBox8.getSelectedItem();
			GuiConfiguration.setFloorPanelDisplay(flrPnlDisplay.toString());
			
			String doorPnlDisplay = (String)jComboBox9.getSelectedItem();
			GuiConfiguration.setDoorPanelDisplay(doorPnlDisplay.toString());
			
			String algoType = (String)jComboBox10.getSelectedItem();
			GuiConfiguration.setAlgorithmType(algoType.toString());
			
			String alarmLight = (String)jAlarmComboBox.getSelectedItem();
			GuiConfiguration.setAlarmLight(alarmLight.toString());
			
			//*******************Newly add function**********************//
			String car1Type = (String)jComboBox12.getSelectedItem();
			GuiConfiguration.setCar1Type(car1Type.toString());
			
			String car2Type = (String)jComboBox13.getSelectedItem();
			GuiConfiguration.setCar2Type(car2Type.toString());

			String car3Type = (String)jComboBox14.getSelectedItem();
			GuiConfiguration.setCar3Type(car3Type.toString());
			
			String car4Type = (String)jComboBox15.getSelectedItem();
			GuiConfiguration.setCar4Type(car4Type.toString());
			
			String car5Type = (String)jComboBox16.getSelectedItem();
			GuiConfiguration.setCar5Type(car5Type.toString());
			
			//**********************************************************//
			
			ElevatorConfigurationReader.showElevator();
			
		}
    	
    }
    
    
    static class Authors implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JFrame AboutFrame = new JFrame("Authors");
			AboutFrame.setVisible(true);
			AboutFrame.setSize(200,150);
			JLabel label = new JLabel("Aarthi Varadarajan");
			JLabel label1 = new JLabel("Jahnavi Athuluru ");
			JLabel label2 = new JLabel("Sandhya Rajagopalan");
			System.out.println("hiiiiiii");
			
			JPanel panel = new JPanel();
			AboutFrame.add(panel);
			panel.add(label);
			panel.add(label1);
			panel.add(label2);
		}
    	
    }


   
    
   
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    public void setjMenuItem2(javax.swing.JMenuItem jMenuItem2) {
		this.jMenuItem2 = jMenuItem2;
	}

	public javax.swing.JMenuItem getjMenuItem2() {
		return jMenuItem2;
	}

	// Variables declaration - do not modify
    private javax.swing.JMenu Authors;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JComboBox jAlarmComboBox;
    
    //****************** Newly add label *****************//
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    //***********************************************//
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jAlarmLabel;
    
    //****************** Newly add label *****************//
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    //***********************************************//
    
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration

}