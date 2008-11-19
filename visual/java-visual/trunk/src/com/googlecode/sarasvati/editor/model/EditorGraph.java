package com.googlecode.sarasvati.editor.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EditorGraph
{
  protected String                         name;

  protected Map<String, EditorGraphMember> members = new HashMap<String, EditorGraphMember>();
  protected List<EditorArc> arcs = new ArrayList<EditorArc>();

  public String getName ()
  {
    return name;
  }

  public void setName (String name)
  {
    this.name = name;
  }

  public Map<String, EditorGraphMember> getMembers ()
  {
    return members;
  }

  public void setMembers (Map<String, EditorGraphMember> members)
  {
    this.members = members;
  }

  public void addMember (EditorGraphMember member)
  {
    members.put( member.getName(), member );
  }

  public boolean hasMember (String name)
  {
    return members.containsKey( name );
  }

  public List<EditorArc> getArcs()
  {
    return arcs;
  }

  public void setArcs( List<EditorArc> arcs )
  {
    this.arcs = arcs;
  }

  public void addArc (String start, String end, String label)
  {
    EditorGraphMember startMember = members.get( start );
    EditorGraphMember endMember = members.get( end );

    EditorArc arc = new EditorArc();
    arc.setStart(  startMember );
    arc.setEnd( endMember );
    arc.setLabel( label );

    arcs.add( arc );
  }
}