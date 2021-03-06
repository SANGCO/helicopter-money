package dev.sangco.hm.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class RandomTransferReceiver extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "random_transfer_receiver_id")
    private Long id;

    @OneToOne
    private Member member;

    private BigDecimal amount;

    private Boolean isDone = false;

    public RandomTransferReceiver(BigDecimal amount) {
        this.amount = amount;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
