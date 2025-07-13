package p276pd;

/* renamed from: pd.y1 */
/* loaded from: classes.dex */
public final class C5475y1 implements p276pd.InterfaceC5460t1 {
    private final java.lang.String from;
    private final java.lang.String receiver;
    private final java.lang.String stake_cpu_quantity;
    private final java.lang.String stake_net_quantity;
    private final boolean transfer;

    public C5475y1(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "from"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "receiver"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "stake_net_quantity"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "stake_cpu_quantity"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.from = r2
            r1.receiver = r3
            r1.stake_net_quantity = r4
            r1.stake_cpu_quantity = r5
            r1.transfer = r6
            return
    }

    public static /* synthetic */ p276pd.C5475y1 copy$default(p276pd.C5475y1 r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.from
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r5 = r3.receiver
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            java.lang.String r6 = r3.stake_net_quantity
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.String r7 = r3.stake_cpu_quantity
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            boolean r8 = r3.transfer
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            pd.y1 r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.from
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.receiver
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.stake_net_quantity
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.stake_cpu_quantity
            return r0
    }

    public final boolean component5() {
            r1 = this;
            boolean r0 = r1.transfer
            return r0
    }

    public final p276pd.C5475y1 copy(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r7 = this;
            java.lang.String r0 = "from"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "receiver"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "stake_net_quantity"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "stake_cpu_quantity"
            p214m2.C4339q.m9706k(r11, r0)
            pd.y1 r0 = new pd.y1
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p276pd.C5475y1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pd.y1 r5 = (p276pd.C5475y1) r5
            java.lang.String r1 = r4.from
            java.lang.String r3 = r5.from
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.receiver
            java.lang.String r3 = r5.receiver
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.stake_net_quantity
            java.lang.String r3 = r5.stake_net_quantity
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.stake_cpu_quantity
            java.lang.String r3 = r5.stake_cpu_quantity
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            boolean r1 = r4.transfer
            boolean r5 = r5.transfer
            if (r1 == r5) goto L3f
            return r2
        L3f:
            return r0
    }

    public final java.lang.String getFrom() {
            r1 = this;
            java.lang.String r0 = r1.from
            return r0
    }

    public final java.lang.String getGetFrom() {
            r1 = this;
            java.lang.String r0 = r1.from
            return r0
    }

    public final java.lang.String getGetReceiver() {
            r1 = this;
            java.lang.String r0 = r1.receiver
            return r0
    }

    public final java.lang.String getGetStakeCpuQuantity() {
            r1 = this;
            java.lang.String r0 = r1.stake_cpu_quantity
            return r0
    }

    public final java.lang.String getGetStakeNetQuantity() {
            r1 = this;
            java.lang.String r0 = r1.stake_net_quantity
            return r0
    }

    public final byte[] getGetTransfer() {
            r3 = this;
            boolean r0 = r3.transfer
            r1 = 1
            byte[] r1 = new byte[r1]
            r2 = 0
            r1[r2] = r0
            return r1
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getHex() {
            r2 = this;
            pd.a r0 = new pd.a
            dd.b r1 = p059dd.EnumC1428b.f7113Y
            r0.<init>(r1)
            pd.a r0 = r0.squishStakeCpuNetArgs(r2)
            java.lang.String r0 = r0.toHex()
            java.lang.String r1 = "AbiBinaryGenTransactions\u2026   this\n        ).toHex()"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getJson() {
            r1 = this;
            java.lang.String r0 = p276pd.InterfaceC5460t1.a.getJson(r1)
            return r0
    }

    public final java.lang.String getReceiver() {
            r1 = this;
            java.lang.String r0 = r1.receiver
            return r0
    }

    public final java.lang.String getStake_cpu_quantity() {
            r1 = this;
            java.lang.String r0 = r1.stake_cpu_quantity
            return r0
    }

    public final java.lang.String getStake_net_quantity() {
            r1 = this;
            java.lang.String r0 = r1.stake_net_quantity
            return r0
    }

    public final boolean getTransfer() {
            r1 = this;
            boolean r0 = r1.transfer
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.from
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.receiver
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.stake_net_quantity
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.stake_cpu_quantity
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            boolean r1 = r3.transfer
            if (r1 == 0) goto L21
            r1 = 1
        L21:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "StakeCpuNetArgs(from="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.from
            r0.append(r1)
            java.lang.String r1 = ", receiver="
            r0.append(r1)
            java.lang.String r1 = r2.receiver
            r0.append(r1)
            java.lang.String r1 = ", stake_net_quantity="
            r0.append(r1)
            java.lang.String r1 = r2.stake_net_quantity
            r0.append(r1)
            java.lang.String r1 = ", stake_cpu_quantity="
            r0.append(r1)
            java.lang.String r1 = r2.stake_cpu_quantity
            r0.append(r1)
            java.lang.String r1 = ", transfer="
            r0.append(r1)
            boolean r1 = r2.transfer
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
