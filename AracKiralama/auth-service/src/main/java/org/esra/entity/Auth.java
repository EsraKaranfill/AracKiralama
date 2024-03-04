package org.esra.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.esra.utility.enums.ERole;
import org.esra.utility.enums.EStatus;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Auth extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
//    @Size(min = 3, max =20, message = "Kullanici adi en az 3, en fazla 20 karakter olabilir.")
    private String username;
    //    @Email
    private String email;
    //    @Size(min = 8, max = 32, message ="Kullanici sifresi en az 8, en fazla 32 karakterden olusabilir." )
    private String password;
    private String activationCode;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private ERole role = ERole.USER;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private EStatus status = EStatus.PENDING;


}
