package Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Contacts", schema = "Hibernate", catalog = "")
public class ContactsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private String id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Phone")
    private String phone;
    @Basic
    @Column(name = "Address")
    private String address;
    @Basic
    @Column(name = "CreateDate")
    private Timestamp createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
}
