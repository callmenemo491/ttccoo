package p276pd;

/* renamed from: pd.g2 */
/* loaded from: classes.dex */
public final class C5412g2 implements p276pd.InterfaceC5460t1 {
    private final java.lang.String from;
    private final java.lang.String memo;
    private final java.lang.String quantity;

    /* renamed from: to */
    private final java.lang.String f21396to;

    public C5412g2(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "from"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "quantity"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "memo"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.from = r2
            r1.f21396to = r3
            r1.quantity = r4
            r1.memo = r5
            return
    }

    public static /* synthetic */ p276pd.C5412g2 copy$default(p276pd.C5412g2 r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.from
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.f21396to
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.quantity
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.lang.String r4 = r0.memo
        L18:
            pd.g2 r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.from
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.f21396to
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.quantity
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final p276pd.C5412g2 copy(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "from"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "quantity"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "memo"
            p214m2.C4339q.m9706k(r5, r0)
            pd.g2 r0 = new pd.g2
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p276pd.C5412g2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pd.g2 r5 = (p276pd.C5412g2) r5
            java.lang.String r1 = r4.from
            java.lang.String r3 = r5.from
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f21396to
            java.lang.String r3 = r5.f21396to
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.quantity
            java.lang.String r3 = r5.quantity
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.memo
            java.lang.String r5 = r5.memo
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
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

    public final java.lang.String getGetMemo() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final java.lang.String getGetQuantity() {
            r1 = this;
            java.lang.String r0 = r1.quantity
            return r0
    }

    public final java.lang.String getGetTo() {
            r1 = this;
            java.lang.String r0 = r1.f21396to
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getHex() {
            r2 = this;
            pd.a r0 = new pd.a
            dd.b r1 = p059dd.EnumC1428b.f7113Y
            r0.<init>(r1)
            pd.a r0 = r0.squishTransferArgs(r2)
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

    public final java.lang.String getMemo() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final java.lang.String getQuantity() {
            r1 = this;
            java.lang.String r0 = r1.quantity
            return r0
    }

    public final java.lang.String getTo() {
            r1 = this;
            java.lang.String r0 = r1.f21396to
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.from
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f21396to
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.quantity
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.memo
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TransferArgs(from="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.from
            r0.append(r1)
            java.lang.String r1 = ", to="
            r0.append(r1)
            java.lang.String r1 = r3.f21396to
            r0.append(r1)
            java.lang.String r1 = ", quantity="
            r0.append(r1)
            java.lang.String r1 = r3.quantity
            r0.append(r1)
            java.lang.String r1 = ", memo="
            r0.append(r1)
            java.lang.String r1 = r3.memo
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
