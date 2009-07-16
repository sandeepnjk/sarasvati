/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NodeTypePreferences.java
 *
 * Created on Jul 4, 2009, 9:07:51 PM
 */

package com.googlecode.sarasvati.editor.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.prefs.BackingStoreException;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

import com.googlecode.sarasvati.editor.model.EditorNodeType;
import com.googlecode.sarasvati.editor.model.EditorPreferences;

/**
 *
 * @author paul
 */
public class NodeTypePreferences extends BasePrefsPage {

    private static final long serialVersionUID = 1L;

    /** Creates new form NodeTypePreferences */
    public NodeTypePreferences() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        nodeTypeList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        nodeTypeNameInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        propertiesTable = new javax.swing.JTable();
        allowCustomInput = new javax.swing.JCheckBox();
        newTypeButton = new javax.swing.JButton();
        deleteTypeButton = new javax.swing.JButton();
        newPropertyButton = new javax.swing.JButton();
        deletePropertyButton = new javax.swing.JButton();
        revertButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();

        nodeTypeList.setModel(getNodeTypeListModel());
        nodeTypeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        nodeTypeList.setPreferredSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setViewportView(nodeTypeList);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.jLabel1.text")); // NOI18N

        nodeTypeNameInput.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.nodeTypeNameInput.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.jLabel3.text")); // NOI18N

        jLabel4.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.jLabel4.text")); // NOI18N

        propertiesTable.setModel(getPropertiesTableModel());
        jScrollPane2.setViewportView(propertiesTable);

        allowCustomInput.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.allowCustomInput.text")); // NOI18N

        newTypeButton.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.newTypeButton.text")); // NOI18N

        deleteTypeButton.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.deleteTypeButton.text")); // NOI18N

        newPropertyButton.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.newPropertyButton.text")); // NOI18N

        deletePropertyButton.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.deletePropertyButton.text")); // NOI18N

        revertButton.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.revertButton.text")); // NOI18N

        applyButton.setText(org.openide.util.NbBundle.getMessage(NodeTypePreferences.class, "NodeTypePreferences.applyButton.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(348, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newTypeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteTypeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(newPropertyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletePropertyButton)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allowCustomInput)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nodeTypeNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(revertButton)
                .addGap(18, 18, 18)
                .addComponent(applyButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newTypeButton)
                        .addGap(17, 17, 17)
                        .addComponent(deleteTypeButton)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nodeTypeNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPropertyButton)
                    .addComponent(deletePropertyButton))
                .addGap(18, 18, 18)
                .addComponent(allowCustomInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyButton)
                    .addComponent(revertButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox allowCustomInput;
    private javax.swing.JButton applyButton;
    private javax.swing.JButton deletePropertyButton;
    private javax.swing.JButton deleteTypeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton newPropertyButton;
    private javax.swing.JButton newTypeButton;
    private javax.swing.JList nodeTypeList;
    private javax.swing.JTextField nodeTypeNameInput;
    private javax.swing.JTable propertiesTable;
    private javax.swing.JButton revertButton;
    // End of variables declaration//GEN-END:variables

    private final DefaultListModel nodeTypeListModel = new DefaultListModel();
    private final EditorNodeTypeTableModel propertiesTableModel = new EditorNodeTypeTableModel();
    private final NameChangeListener nameChangeListener = new NameChangeListener();

    public ListModel getNodeTypeListModel ()
    {
      return nodeTypeListModel;
    }

    public TableModel getPropertiesTableModel ()
    {
      return propertiesTableModel;
    }

    protected class NameChangeListener implements DocumentListener
    {
      private int index;
      private EditorNodeType nodeType;

      /**
       * @return the nodeType
       */
      public EditorNodeType getNodeType ()
      {
        return nodeType;
      }

      /**
       * @param nodeType the nodeType to set
       */
      public void setNodeType (EditorNodeType nodeType)
      {
        this.nodeType = nodeType;
      }

      /**
       * @return the index
       */
      public int getIndex ()
      {
        return index;
      }

      /**
       * @param index the index to set
       */
      public void setIndex (int index)
      {
        this.index = index;
      }

      @Override
      public void changedUpdate (DocumentEvent e)
      {
        nameUpdated();
      }

      @Override
      public void insertUpdate (DocumentEvent e)
      {
        nameUpdated();
      }

      @Override
      public void removeUpdate (DocumentEvent e)
      {
        nameUpdated();
      }

      public void nameUpdated ()
      {
        if ( nodeType != null )
        {
          nodeType.setName( nodeTypeNameInput.getText() );
          nodeTypeListModel.set( index, nodeType );
        }
      }
    }


    @Override
    public void setup ()
    {
      propertiesTable.putClientProperty( "terminateEditOnFocusLost", Boolean.TRUE );

      reloadList();

      nodeTypeNameInput.getDocument().addDocumentListener( nameChangeListener );
      allowCustomInput.addActionListener( new ActionListener()
      {
        @Override
        public void actionPerformed (ActionEvent e)
        {
          EditorNodeType nodeType = (EditorNodeType)nodeTypeList.getSelectedValue();
          if ( nodeType != null )
          {
            nodeType.setAllowNonSpecifiedAttributes( allowCustomInput.isSelected() );
          }
        }
      });

      nodeTypeList.getSelectionModel().addListSelectionListener( new ListSelectionListener()
      {
        @Override
        public void valueChanged (final ListSelectionEvent event)
        {
          editSelected();
        }
      });

      newTypeButton.addActionListener( new ActionListener()
      {
        @Override
        public void actionPerformed (ActionEvent e)
        {
          EditorNodeType newNodeType = new EditorNodeType( "new-node-type", false );
          nodeTypeListModel.addElement( newNodeType );
          nodeTypeList.setSelectedValue( newNodeType, true );
        }
      });

      deleteTypeButton.addActionListener( new ActionListener()
      {
        @Override
        public void actionPerformed (ActionEvent e)
        {
          nodeTypeListModel.remove( nodeTypeList.getSelectedIndex() );
        }
      });

      newPropertyButton.addActionListener( new ActionListener()
      {
        @Override
        public void actionPerformed (ActionEvent e)
        {
          propertiesTableModel.addAttribute();
        }
      });

      deletePropertyButton.addActionListener( new ActionListener()
      {
        @Override
        public void actionPerformed (ActionEvent e)
        {
          int [] indices = propertiesTable.getSelectedRows();
          Arrays.sort( indices );
          for ( int i = indices.length - 1; i >= 0; i-- )
          {
            propertiesTableModel.removeAttribute( indices[i] );
          }
        }
      });

      revertButton.addActionListener( new ActionListener()
      {
        @Override
        public void actionPerformed (ActionEvent e)
        {
          reloadList();
        }
      });

      applyButton.addActionListener( new ActionListener()
      {
        @Override
        public void actionPerformed (final ActionEvent event)
        {
          List<EditorNodeType> newNodeTypes = new ArrayList<EditorNodeType>( nodeTypeListModel.size() );

          for ( int i = 0; i < nodeTypeListModel.size(); i++ )
          {
            newNodeTypes.add( (EditorNodeType)nodeTypeListModel.get( i ) );
          }

          try
          {
            EditorPreferences.getInstance().saveNodeTypes( newNodeTypes );
            JOptionPane.showMessageDialog( NodeTypePreferences.this, "Changes saved", "Info", JOptionPane.INFORMATION_MESSAGE );
          }
          catch (final BackingStoreException e)
          {
            e.printStackTrace();
            JOptionPane.showMessageDialog( NodeTypePreferences.this,
                                           "Failed to save preferences: " + e.getMessage(),
                                           "Error", JOptionPane.ERROR_MESSAGE );
          }
        }
      });
    }

    public void reloadList ()
    {
      nodeTypeListModel.removeAllElements();
      for ( EditorNodeType nodeType :  EditorPreferences.getInstance().getNodeTypes() )
      {
        nodeTypeListModel.addElement( nodeType.copy() );
      }
    }

    @Override
    public void displayPage ()
    {
      reloadList();
      clearEdit ();
    }

    protected void editSelected ()
    {
      EditorNodeType nodeType = (EditorNodeType)nodeTypeList.getSelectedValue();
      if ( nodeType != null )
      {
        ensureEnabled();
        editType( nodeType );
        deleteTypeButton.setEnabled( true );
      }
      else
      {
        clearEdit();
      }
    }

    public void editType (EditorNodeType nodeType)
    {
      propertiesTableModel.setNodeType( nodeType );
      nameChangeListener.setIndex( nodeTypeList.getSelectedIndex() );
      nameChangeListener.setNodeType( nodeType );

      nodeTypeNameInput.setText( nodeType.getName() );
      allowCustomInput.setSelected( nodeType.isAllowNonSpecifiedAttributes() );
    }

    protected void ensureEnabled ()
    {
      if ( !nodeTypeNameInput.isEnabled() )
      {
        nodeTypeNameInput.setEnabled( true );
        allowCustomInput.setEnabled( true );
        propertiesTable.setEnabled( true );
        newPropertyButton.setEnabled( true );
        deletePropertyButton.setEnabled( true );
        allowCustomInput.setEnabled( true );
        deleteTypeButton.setEnabled( true );
      }
    }

    public void clearEdit ()
    {
      propertiesTableModel.setNodeType( null );
      nameChangeListener.setNodeType( null );

      nodeTypeNameInput.setText( "" );
      allowCustomInput.setSelected( false );

      nodeTypeNameInput.setEnabled( false );
      allowCustomInput.setEnabled( false );
      propertiesTable.setEnabled( false );
      newPropertyButton.setEnabled( false );
      deletePropertyButton.setEnabled( false );
      allowCustomInput.setEnabled( false );

      deleteTypeButton.setEnabled( false );
    }
}
