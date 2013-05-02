package de.gedoplan.buch.eedemos.jpa.entity;

import de.gedoplan.baselibs.persistence.entity.GeneratedIntegerIdEntity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(name = Person.TABLE_NAME)
public class Person extends GeneratedIntegerIdEntity
{
  public static final String TABLE_NAME    = "EEDEMOS_PERSON";

  private String             name;

  @OneToMany
  @JoinColumn(name = "PERSON_ID")
  private List<MailAddress>  mailAddresses = new ArrayList<MailAddress>();

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public List<MailAddress> getMailAddresses()
  {
    return this.mailAddresses;
  }
}
