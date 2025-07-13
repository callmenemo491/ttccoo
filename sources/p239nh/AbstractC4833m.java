package p239nh;

/* renamed from: nh.m */
/* loaded from: classes.dex */
public abstract class AbstractC4833m extends p239nh.AbstractC4822b implements sh.InterfaceC6077f {
    public AbstractC4833m() {
            r0 = this;
            r0.<init>()
            return
    }

    public AbstractC4833m(java.lang.Object r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
            r7 = this;
            r0 = 1
            r12 = r12 & r0
            if (r12 != r0) goto L6
            r6 = 1
            goto L8
        L6:
            r0 = 0
            r6 = 0
        L8:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p239nh.AbstractC4833m
            r2 = 0
            if (r1 == 0) goto L3a
            nh.m r5 = (p239nh.AbstractC4833m) r5
            sh.c r1 = r4.m10849d()
            sh.c r3 = r5.m10849d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            java.lang.String r1 = r4.f19218b0
            java.lang.String r3 = r5.f19218b0
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            java.lang.String r1 = r4.f19219c0
            java.lang.String r3 = r5.f19219c0
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            java.lang.Object r1 = r4.f19216Z
            java.lang.Object r5 = r5.f19216Z
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 == 0) goto L38
            goto L39
        L38:
            r0 = 0
        L39:
            return r0
        L3a:
            boolean r0 = r5 instanceof sh.InterfaceC6077f
            if (r0 == 0) goto L47
            sh.a r0 = r4.m10847a()
            boolean r5 = r5.equals(r0)
            return r5
        L47:
            return r2
    }

    public int hashCode() {
            r3 = this;
            sh.c r0 = r3.m10849d()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f19218b0
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f19219c0
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            sh.a r0 = r3.m10847a()
            if (r0 == r3) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.String r0 = "property "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f19218b0
            java.lang.String r2 = " (Kotlin reflection is not available)"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
