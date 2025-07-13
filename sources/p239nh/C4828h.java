package p239nh;

/* renamed from: nh.h */
/* loaded from: classes.dex */
public class C4828h extends p239nh.AbstractC4822b implements p239nh.InterfaceC4827g, sh.InterfaceC6075d {

    /* renamed from: e0 */
    public final int f19225e0;

    /* renamed from: f0 */
    public final int f19226f0;

    public C4828h(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto L7
            r7 = 1
            goto L9
        L7:
            r0 = 0
            r7 = 0
        L9:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f19225e0 = r9
            int r9 = r14 >> 1
            r8.f19226f0 = r9
            return
    }

    @Override // p239nh.AbstractC4822b
    /* renamed from: c */
    public sh.InterfaceC6072a mo10848c() {
            r1 = this;
            nh.s r0 = p239nh.C4838r.f19233a
            java.util.Objects.requireNonNull(r0)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p239nh.C4828h
            r2 = 0
            if (r1 == 0) goto L46
            nh.h r5 = (p239nh.C4828h) r5
            java.lang.String r1 = r4.f19218b0
            java.lang.String r3 = r5.f19218b0
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.f19219c0
            java.lang.String r3 = r5.f19219c0
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            int r1 = r4.f19226f0
            int r3 = r5.f19226f0
            if (r1 != r3) goto L44
            int r1 = r4.f19225e0
            int r3 = r5.f19225e0
            if (r1 != r3) goto L44
            java.lang.Object r1 = r4.f19216Z
            java.lang.Object r3 = r5.f19216Z
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 == 0) goto L44
            sh.c r1 = r4.m10849d()
            sh.c r5 = r5.m10849d()
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 == 0) goto L44
            goto L45
        L44:
            r0 = 0
        L45:
            return r0
        L46:
            boolean r0 = r5 instanceof sh.InterfaceC6075d
            if (r0 == 0) goto L53
            sh.a r0 = r4.m10847a()
            boolean r5 = r5.equals(r0)
            return r5
        L53:
            return r2
    }

    @Override // p239nh.InterfaceC4827g
    /* renamed from: g */
    public int mo7456g() {
            r1 = this;
            int r0 = r1.f19225e0
            return r0
    }

    public int hashCode() {
            r3 = this;
            sh.c r0 = r3.m10849d()
            if (r0 != 0) goto L8
            r0 = 0
            goto L12
        L8:
            sh.c r0 = r3.m10849d()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
        L12:
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
            java.lang.String r0 = r3.f19218b0
            java.lang.String r1 = "<init>"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            java.lang.String r0 = "constructor (Kotlin reflection is not available)"
            goto L26
        L18:
            java.lang.String r0 = "function "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f19218b0
            java.lang.String r2 = " (Kotlin reflection is not available)"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
        L26:
            return r0
    }
}
