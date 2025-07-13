package md;

/* renamed from: md.t0 */
/* loaded from: classes.dex */
public final class C4580t0 implements java.io.Serializable {
    private final double cost;
    private final java.lang.String image;
    private final java.lang.String info;
    private final long template_id;

    public C4580t0(long r2, double r4, java.lang.String r6, java.lang.String r7) {
            r1 = this;
            java.lang.String r0 = "image"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "info"
            p214m2.C4339q.m9706k(r7, r0)
            r1.<init>()
            r1.template_id = r2
            r1.cost = r4
            r1.image = r6
            r1.info = r7
            return
    }

    public static /* synthetic */ md.C4580t0 copy$default(md.C4580t0 r7, long r8, double r10, java.lang.String r12, java.lang.String r13, int r14, java.lang.Object r15) {
            r15 = r14 & 1
            if (r15 == 0) goto L6
            long r8 = r7.template_id
        L6:
            r1 = r8
            r8 = r14 & 2
            if (r8 == 0) goto Ld
            double r10 = r7.cost
        Ld:
            r3 = r10
            r8 = r14 & 4
            if (r8 == 0) goto L14
            java.lang.String r12 = r7.image
        L14:
            r5 = r12
            r8 = r14 & 8
            if (r8 == 0) goto L1b
            java.lang.String r13 = r7.info
        L1b:
            r6 = r13
            r0 = r7
            md.t0 r7 = r0.copy(r1, r3, r5, r6)
            return r7
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.template_id
            return r0
    }

    public final double component2() {
            r2 = this;
            double r0 = r2.cost
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.image
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.info
            return r0
    }

    public final md.C4580t0 copy(long r9, double r11, java.lang.String r13, java.lang.String r14) {
            r8 = this;
            java.lang.String r0 = "image"
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "info"
            p214m2.C4339q.m9706k(r14, r0)
            md.t0 r0 = new md.t0
            r1 = r0
            r2 = r9
            r4 = r11
            r6 = r13
            r7 = r14
            r1.<init>(r2, r4, r6, r7)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof md.C4580t0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.t0 r8 = (md.C4580t0) r8
            long r3 = r7.template_id
            long r5 = r8.template_id
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            double r3 = r7.cost
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r8.cost
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L28
            return r2
        L28:
            java.lang.String r1 = r7.image
            java.lang.String r3 = r8.image
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L33
            return r2
        L33:
            java.lang.String r1 = r7.info
            java.lang.String r8 = r8.info
            boolean r8 = p214m2.C4339q.m9702c(r1, r8)
            if (r8 != 0) goto L3e
            return r2
        L3e:
            return r0
    }

    public final double getCost() {
            r2 = this;
            double r0 = r2.cost
            return r0
    }

    public final java.lang.String getImage() {
            r1 = this;
            java.lang.String r0 = r1.image
            return r0
    }

    public final java.lang.String getInfo() {
            r1 = this;
            java.lang.String r0 = r1.info
            return r0
    }

    public final long getTemplate_id() {
            r2 = this;
            long r0 = r2.template_id
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.template_id
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 * 31
            double r3 = r7.cost
            long r3 = java.lang.Double.doubleToLongBits(r3)
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r7.image
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            java.lang.String r1 = r7.info
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "SecretToolModel(template_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", cost="
            r0.append(r1)
            double r1 = r3.cost
            r0.append(r1)
            java.lang.String r1 = ", image="
            r0.append(r1)
            java.lang.String r1 = r3.image
            r0.append(r1)
            java.lang.String r1 = ", info="
            r0.append(r1)
            java.lang.String r1 = r3.info
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
