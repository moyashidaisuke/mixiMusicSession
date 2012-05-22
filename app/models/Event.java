package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import net.sf.oval.guard.Post;

import org.apache.commons.lang.StringUtils;
import org.h2.engine.User;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;
import play.templates.JavaExtensions;

@Entity
public class Event extends Model {



	// タイトル
	@Required
	public String title;

	public Date startAt;

	public Date endAt;

	public String place;

	@Lob
	@MaxSize(10000)
	public String content;

	@OneToMany
	public List<Song> song = new ArrayList<Song>();


	@Override
	public String toString() {

		return title;
	}


}
