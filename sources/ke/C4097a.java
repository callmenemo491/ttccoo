package ke;

/* renamed from: ke.a */
/* loaded from: classes.dex */
public final class C4097a implements java.io.Serializable {

    /* renamed from: Y */
    public final p255od.C5194b0 f17022Y;

    /* renamed from: Z */
    public final je.C3590l f17023Z;

    /* renamed from: a0 */
    public final je.C3579a f17024a0;

    /* renamed from: b0 */
    public final je.C3579a f17025b0;

    /* renamed from: c0 */
    public final double f17026c0;

    /* renamed from: d0 */
    public final double f17027d0;

    public C4097a(p255od.C5194b0 r2, je.C3590l r3, je.C3579a r4, je.C3579a r5, double r6, double r8) {
            r1 = this;
            java.lang.String r0 = "from"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.f17022Y = r2
            r1.f17023Z = r3
            r1.f17024a0 = r4
            r1.f17025b0 = r5
            r1.f17026c0 = r6
            r1.f17027d0 = r8
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof ke.C4097a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ke.a r6 = (ke.C4097a) r6
            od.b0 r1 = r5.f17022Y
            od.b0 r3 = r6.f17022Y
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            je.l r1 = r5.f17023Z
            je.l r3 = r6.f17023Z
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            je.a r1 = r5.f17024a0
            je.a r3 = r6.f17024a0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            je.a r1 = r5.f17025b0
            je.a r3 = r6.f17025b0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            double r3 = r5.f17026c0
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f17026c0
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4b
            return r2
        L4b:
            double r3 = r5.f17027d0
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f17027d0
            java.lang.Double r6 = java.lang.Double.valueOf(r3)
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L5e
            return r2
        L5e:
            return r0
    }

    public int hashCode() {
            r6 = this;
            od.b0 r0 = r6.f17022Y
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            je.l r1 = r6.f17023Z
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            je.a r0 = r6.f17024a0
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            je.a r1 = r6.f17025b0
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            double r2 = r6.f17026c0
            long r2 = java.lang.Double.doubleToLongBits(r2)
            r0 = 32
            long r4 = r2 >>> r0
            long r2 = r2 ^ r4
            int r3 = (int) r2
            int r1 = r1 + r3
            int r1 = r1 * 31
            double r2 = r6.f17027d0
            long r2 = java.lang.Double.doubleToLongBits(r2)
            long r4 = r2 >>> r0
            long r2 = r2 ^ r4
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "SwapData(balanceFrom="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            od.b0 r1 = r3.f17022Y
            r0.append(r1)
            java.lang.String r1 = ", tradeElement="
            r0.append(r1)
            je.l r1 = r3.f17023Z
            r0.append(r1)
            java.lang.String r1 = ", from="
            r0.append(r1)
            je.a r1 = r3.f17024a0
            r0.append(r1)
            java.lang.String r1 = ", to="
            r0.append(r1)
            je.a r1 = r3.f17025b0
            r0.append(r1)
            java.lang.String r1 = ", liquidityFrom="
            r0.append(r1)
            double r1 = r3.f17026c0
            r0.append(r1)
            java.lang.String r1 = ", liquidityTo="
            r0.append(r1)
            double r1 = r3.f17027d0
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
