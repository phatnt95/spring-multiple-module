package io.github.phtnt95.core.account.model;

import io.github.phtnt95.core.utils.AbstractModel;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "account")
public class Account extends AbstractModel {
    private String name;
    private String saturation;
    private String phone;
}
