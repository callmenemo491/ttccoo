package p381w;

/* renamed from: w.a */
/* loaded from: classes.dex */
public class C6760a extends p381w.C6770k {

    /* renamed from: J0 */
    public int f26062J0;

    /* renamed from: K0 */
    public boolean f26063K0;

    /* renamed from: L0 */
    public int f26064L0;

    /* renamed from: M0 */
    public boolean f26065M0;

    public C6760a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f26062J0 = r0
            r1 = 1
            r2.f26063K0 = r1
            r2.f26064L0 = r0
            r2.f26065M0 = r0
            return
    }

    @Override // p381w.C6765f
    /* renamed from: C */
    public boolean mo13670C() {
            r1 = this;
            boolean r0 = r1.f26065M0
            return r0
    }

    @Override // p381w.C6765f
    /* renamed from: D */
    public boolean mo13671D() {
            r1 = this;
            boolean r0 = r1.f26065M0
            return r0
    }

    /* renamed from: T */
    public boolean m13672T() {
            r12 = this;
            w.d$a r0 = p381w.C6763d.a.f26098b0
            w.d$a r1 = p381w.C6763d.a.f26096Z
            w.d$a r2 = p381w.C6763d.a.f26097a0
            w.d$a r3 = p381w.C6763d.a.f26095Y
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 1
        Lc:
            int r8 = r12.f26240I0
            r9 = 3
            r10 = 2
            if (r6 >= r8) goto L3f
            w.f[] r8 = r12.f26239H0
            r8 = r8[r6]
            boolean r11 = r12.f26063K0
            if (r11 != 0) goto L21
            boolean r11 = r8.mo13675g()
            if (r11 != 0) goto L21
            goto L3c
        L21:
            int r11 = r12.f26062J0
            if (r11 == 0) goto L27
            if (r11 != r5) goto L2f
        L27:
            boolean r11 = r8.mo13670C()
            if (r11 != 0) goto L2f
        L2d:
            r7 = 0
            goto L3c
        L2f:
            int r11 = r12.f26062J0
            if (r11 == r10) goto L35
            if (r11 != r9) goto L3c
        L35:
            boolean r8 = r8.mo13671D()
            if (r8 != 0) goto L3c
            goto L2d
        L3c:
            int r6 = r6 + 1
            goto Lc
        L3f:
            if (r7 == 0) goto Lc2
            if (r8 <= 0) goto Lc2
            r6 = 0
            r7 = 0
        L45:
            int r8 = r12.f26240I0
            if (r4 >= r8) goto Lae
            w.f[] r8 = r12.f26239H0
            r8 = r8[r4]
            boolean r11 = r12.f26063K0
            if (r11 != 0) goto L58
            boolean r11 = r8.mo13675g()
            if (r11 != 0) goto L58
            goto Lab
        L58:
            if (r7 != 0) goto L7d
            int r7 = r12.f26062J0
            if (r7 != 0) goto L67
            w.d r6 = r8.mo13712l(r3)
        L62:
            int r6 = r6.m13680c()
            goto L7c
        L67:
            if (r7 != r5) goto L6e
            w.d r6 = r8.mo13712l(r2)
            goto L62
        L6e:
            if (r7 != r10) goto L75
            w.d r6 = r8.mo13712l(r1)
            goto L62
        L75:
            if (r7 != r9) goto L7c
            w.d r6 = r8.mo13712l(r0)
            goto L62
        L7c:
            r7 = 1
        L7d:
            int r11 = r12.f26062J0
            if (r11 != 0) goto L8e
            w.d r8 = r8.mo13712l(r3)
        L85:
            int r8 = r8.m13680c()
            int r6 = java.lang.Math.min(r6, r8)
            goto Lab
        L8e:
            if (r11 != r5) goto L9d
            w.d r8 = r8.mo13712l(r2)
        L94:
            int r8 = r8.m13680c()
            int r6 = java.lang.Math.max(r6, r8)
            goto Lab
        L9d:
            if (r11 != r10) goto La4
            w.d r8 = r8.mo13712l(r1)
            goto L85
        La4:
            if (r11 != r9) goto Lab
            w.d r8 = r8.mo13712l(r0)
            goto L94
        Lab:
            int r4 = r4 + 1
            goto L45
        Lae:
            int r0 = r12.f26064L0
            int r6 = r6 + r0
            int r0 = r12.f26062J0
            if (r0 == 0) goto Lbc
            if (r0 != r5) goto Lb8
            goto Lbc
        Lb8:
            r12.m13698J(r6, r6)
            goto Lbf
        Lbc:
            r12.m13697I(r6, r6)
        Lbf:
            r12.f26065M0 = r5
            return r5
        Lc2:
            return r4
    }

    /* renamed from: U */
    public int m13673U() {
            r3 = this;
            int r0 = r3.f26062J0
            if (r0 == 0) goto L10
            r1 = 1
            if (r0 == r1) goto L10
            r2 = 2
            if (r0 == r2) goto Lf
            r2 = 3
            if (r0 == r2) goto Lf
            r0 = -1
            return r0
        Lf:
            return r1
        L10:
            r0 = 0
            return r0
    }

    @Override // p381w.C6765f
    /* renamed from: f */
    public void mo13674f(p365v.C6477d r14, boolean r15) {
            r13 = this;
            w.f$a r15 = p381w.C6765f.a.f26191a0
            w.d[] r0 = r13.f26124N
            w.d r1 = r13.f26114F
            r2 = 0
            r0[r2] = r1
            w.d r1 = r13.f26116G
            r3 = 2
            r0[r3] = r1
            w.d r1 = r13.f26118H
            r4 = 1
            r0[r4] = r1
            w.d r1 = r13.f26119I
            r5 = 3
            r0[r5] = r1
            r0 = 0
        L19:
            w.d[] r1 = r13.f26124N
            int r6 = r1.length
            if (r0 >= r6) goto L2b
            r6 = r1[r0]
            r1 = r1[r0]
            v.h r1 = r14.m13134l(r1)
            r6.f26094i = r1
            int r0 = r0 + 1
            goto L19
        L2b:
            int r0 = r13.f26062J0
            if (r0 < 0) goto L208
            r6 = 4
            if (r0 >= r6) goto L208
            r0 = r1[r0]
            boolean r1 = r13.f26065M0
            if (r1 != 0) goto L3b
            r13.m13672T()
        L3b:
            boolean r1 = r13.f26065M0
            if (r1 == 0) goto L6f
            r13.f26065M0 = r2
            int r15 = r13.f26062J0
            if (r15 == 0) goto L5c
            if (r15 != r4) goto L48
            goto L5c
        L48:
            if (r15 == r3) goto L4c
            if (r15 != r5) goto L6e
        L4c:
            w.d r15 = r13.f26116G
            v.h r15 = r15.f26094i
            int r0 = r13.f26134X
            r14.m13127e(r15, r0)
            w.d r15 = r13.f26119I
            v.h r15 = r15.f26094i
            int r0 = r13.f26134X
            goto L6b
        L5c:
            w.d r15 = r13.f26114F
            v.h r15 = r15.f26094i
            int r0 = r13.f26133W
            r14.m13127e(r15, r0)
            w.d r15 = r13.f26118H
            v.h r15 = r15.f26094i
            int r0 = r13.f26133W
        L6b:
            r14.m13127e(r15, r0)
        L6e:
            return
        L6f:
            r1 = 0
        L70:
            int r7 = r13.f26240I0
            if (r1 >= r7) goto Lb9
            w.f[] r7 = r13.f26239H0
            r7 = r7[r1]
            boolean r8 = r13.f26063K0
            if (r8 != 0) goto L83
            boolean r8 = r7.mo13675g()
            if (r8 != 0) goto L83
            goto Lb6
        L83:
            int r8 = r13.f26062J0
            if (r8 == 0) goto L89
            if (r8 != r4) goto L9d
        L89:
            w.f$a r8 = r7.m13716p()
            if (r8 != r15) goto L9d
            w.d r8 = r7.f26114F
            w.d r8 = r8.f26091f
            if (r8 == 0) goto L9d
            w.d r8 = r7.f26118H
            w.d r8 = r8.f26091f
            if (r8 == 0) goto L9d
        L9b:
            r15 = 1
            goto Lba
        L9d:
            int r8 = r13.f26062J0
            if (r8 == r3) goto La3
            if (r8 != r5) goto Lb6
        La3:
            w.f$a r8 = r7.m13720t()
            if (r8 != r15) goto Lb6
            w.d r8 = r7.f26116G
            w.d r8 = r8.f26091f
            if (r8 == 0) goto Lb6
            w.d r7 = r7.f26119I
            w.d r7 = r7.f26091f
            if (r7 == 0) goto Lb6
            goto L9b
        Lb6:
            int r1 = r1 + 1
            goto L70
        Lb9:
            r15 = 0
        Lba:
            w.d r1 = r13.f26114F
            boolean r1 = r1.m13683f()
            if (r1 != 0) goto Lcd
            w.d r1 = r13.f26118H
            boolean r1 = r1.m13683f()
            if (r1 == 0) goto Lcb
            goto Lcd
        Lcb:
            r1 = 0
            goto Lce
        Lcd:
            r1 = 1
        Lce:
            w.d r7 = r13.f26116G
            boolean r7 = r7.m13683f()
            if (r7 != 0) goto Le1
            w.d r7 = r13.f26119I
            boolean r7 = r7.m13683f()
            if (r7 == 0) goto Ldf
            goto Le1
        Ldf:
            r7 = 0
            goto Le2
        Le1:
            r7 = 1
        Le2:
            if (r15 != 0) goto Lf8
            int r15 = r13.f26062J0
            if (r15 != 0) goto Lea
            if (r1 != 0) goto Lf6
        Lea:
            if (r15 != r3) goto Lee
            if (r7 != 0) goto Lf6
        Lee:
            if (r15 != r4) goto Lf2
            if (r1 != 0) goto Lf6
        Lf2:
            if (r15 != r5) goto Lf8
            if (r7 == 0) goto Lf8
        Lf6:
            r15 = 1
            goto Lf9
        Lf8:
            r15 = 0
        Lf9:
            r1 = 5
            if (r15 != 0) goto Lfd
            r1 = 4
        Lfd:
            r15 = 0
        Lfe:
            int r7 = r13.f26240I0
            if (r15 >= r7) goto L173
            w.f[] r7 = r13.f26239H0
            r7 = r7[r15]
            boolean r8 = r13.f26063K0
            if (r8 != 0) goto L111
            boolean r8 = r7.mo13675g()
            if (r8 != 0) goto L111
            goto L170
        L111:
            w.d[] r8 = r7.f26124N
            int r9 = r13.f26062J0
            r8 = r8[r9]
            v.h r8 = r14.m13134l(r8)
            w.d[] r7 = r7.f26124N
            int r9 = r13.f26062J0
            r10 = r7[r9]
            r10.f26094i = r8
            r10 = r7[r9]
            w.d r10 = r10.f26091f
            if (r10 == 0) goto L137
            r10 = r7[r9]
            w.d r10 = r10.f26091f
            w.f r10 = r10.f26089d
            if (r10 != r13) goto L137
            r7 = r7[r9]
            int r7 = r7.f26092g
            int r7 = r7 + r2
            goto L138
        L137:
            r7 = 0
        L138:
            if (r9 == 0) goto L153
            if (r9 != r3) goto L13d
            goto L153
        L13d:
            v.h r9 = r0.f26094i
            int r10 = r13.f26064L0
            int r10 = r10 + r7
            v.b r11 = r14.m13135m()
            v.h r12 = r14.m13136n()
            r12.f25110d = r2
            r11.m13104e(r9, r8, r12, r10)
            r14.m13125c(r11)
            goto L168
        L153:
            v.h r9 = r0.f26094i
            int r10 = r13.f26064L0
            int r10 = r10 - r7
            v.b r11 = r14.m13135m()
            v.h r12 = r14.m13136n()
            r12.f25110d = r2
            r11.m13105f(r9, r8, r12, r10)
            r14.m13125c(r11)
        L168:
            v.h r9 = r0.f26094i
            int r10 = r13.f26064L0
            int r10 = r10 + r7
            r14.m13126d(r9, r8, r10, r1)
        L170:
            int r15 = r15 + 1
            goto Lfe
        L173:
            int r15 = r13.f26062J0
            r0 = 8
            if (r15 != 0) goto L19f
            w.d r15 = r13.f26118H
            v.h r15 = r15.f26094i
            w.d r1 = r13.f26114F
            v.h r1 = r1.f26094i
            r14.m13126d(r15, r1, r2, r0)
            w.d r15 = r13.f26114F
            v.h r15 = r15.f26094i
            w.f r0 = r13.f26128R
            w.d r0 = r0.f26118H
            v.h r0 = r0.f26094i
            r14.m13126d(r15, r0, r2, r6)
            w.d r15 = r13.f26114F
            v.h r15 = r15.f26094i
            w.f r0 = r13.f26128R
            w.d r0 = r0.f26114F
        L199:
            v.h r0 = r0.f26094i
            r14.m13126d(r15, r0, r2, r2)
            goto L208
        L19f:
            if (r15 != r4) goto L1c2
            w.d r15 = r13.f26114F
            v.h r15 = r15.f26094i
            w.d r1 = r13.f26118H
            v.h r1 = r1.f26094i
            r14.m13126d(r15, r1, r2, r0)
            w.d r15 = r13.f26114F
            v.h r15 = r15.f26094i
            w.f r0 = r13.f26128R
            w.d r0 = r0.f26114F
            v.h r0 = r0.f26094i
            r14.m13126d(r15, r0, r2, r6)
            w.d r15 = r13.f26114F
            v.h r15 = r15.f26094i
            w.f r0 = r13.f26128R
            w.d r0 = r0.f26118H
            goto L199
        L1c2:
            if (r15 != r3) goto L1e5
            w.d r15 = r13.f26119I
            v.h r15 = r15.f26094i
            w.d r1 = r13.f26116G
            v.h r1 = r1.f26094i
            r14.m13126d(r15, r1, r2, r0)
            w.d r15 = r13.f26116G
            v.h r15 = r15.f26094i
            w.f r0 = r13.f26128R
            w.d r0 = r0.f26119I
            v.h r0 = r0.f26094i
            r14.m13126d(r15, r0, r2, r6)
            w.d r15 = r13.f26116G
            v.h r15 = r15.f26094i
            w.f r0 = r13.f26128R
            w.d r0 = r0.f26116G
            goto L199
        L1e5:
            if (r15 != r5) goto L208
            w.d r15 = r13.f26116G
            v.h r15 = r15.f26094i
            w.d r1 = r13.f26119I
            v.h r1 = r1.f26094i
            r14.m13126d(r15, r1, r2, r0)
            w.d r15 = r13.f26116G
            v.h r15 = r15.f26094i
            w.f r0 = r13.f26128R
            w.d r0 = r0.f26116G
            v.h r0 = r0.f26094i
            r14.m13126d(r15, r0, r2, r6)
            w.d r15 = r13.f26116G
            v.h r15 = r15.f26094i
            w.f r0 = r13.f26128R
            w.d r0 = r0.f26119I
            goto L199
        L208:
            return
    }

    @Override // p381w.C6765f
    /* renamed from: g */
    public boolean mo13675g() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p381w.C6770k, p381w.C6765f
    /* renamed from: i */
    public void mo13676i(p381w.C6765f r1, java.util.HashMap<p381w.C6765f, p381w.C6765f> r2) {
            r0 = this;
            super.mo13676i(r1, r2)
            w.a r1 = (p381w.C6760a) r1
            int r2 = r1.f26062J0
            r0.f26062J0 = r2
            boolean r2 = r1.f26063K0
            r0.f26063K0 = r2
            int r1 = r1.f26064L0
            r0.f26064L0 = r1
            return
    }

    @Override // p381w.C6765f
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "[Barrier] "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r4.f26158k0
            java.lang.String r2 = " {"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            r1 = 0
        Lf:
            int r2 = r4.f26240I0
            if (r1 >= r2) goto L2f
            w.f[] r2 = r4.f26239H0
            r2 = r2[r1]
            if (r1 <= 0) goto L1f
            java.lang.String r3 = ", "
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r3)
        L1f:
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r2 = r2.f26158k0
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r1 + 1
            goto Lf
        L2f:
            java.lang.String r1 = "}"
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            return r0
    }
}
