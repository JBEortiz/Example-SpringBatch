package com.juan.batch.batchitemprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import com.juan.batch.batchprocessing.Person;
/**
 * TODO ItemProcessor<Person, Person>
 * Interfaz por defecto que implementa spring batch
 * @author juanj
 *
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

  private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
/**
 * TODO
 * Procesadores por lotes para la ingesta de datos
 * Transformalos y enviarlos a otro lugar 
 */
  @Override
  public Person process(final Person person) throws Exception {
	  /*
	   * metodo que convierte de minusculas a mayusculas 
	   */
    final String firstName = person.getFirstName().toUpperCase();
    final String lastName = person.getLastName().toUpperCase();

    final Person transformedPerson = new Person(firstName, lastName);

    log.info("Converting (" + person + ") into (" + transformedPerson + ")");

    return transformedPerson;
  }

}