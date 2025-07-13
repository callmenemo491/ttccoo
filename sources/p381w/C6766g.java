package p381w;

/* renamed from: w.g */
/* loaded from: classes.dex */
public class C6766g extends p381w.C6773n {

    /* renamed from: I0 */
    public p401x.C6894b f26194I0;

    /* renamed from: J0 */
    public p401x.C6897e f26195J0;

    /* renamed from: K0 */
    public p401x.C6894b.b f26196K0;

    /* renamed from: L0 */
    public boolean f26197L0;

    /* renamed from: M0 */
    public p365v.C6477d f26198M0;

    /* renamed from: N0 */
    public int f26199N0;

    /* renamed from: O0 */
    public int f26200O0;

    /* renamed from: P0 */
    public int f26201P0;

    /* renamed from: Q0 */
    public int f26202Q0;

    /* renamed from: R0 */
    public p381w.C6762c[] f26203R0;

    /* renamed from: S0 */
    public p381w.C6762c[] f26204S0;

    /* renamed from: T0 */
    public int f26205T0;

    /* renamed from: U0 */
    public boolean f26206U0;

    /* renamed from: V0 */
    public boolean f26207V0;

    /* renamed from: W0 */
    public java.lang.ref.WeakReference<p381w.C6763d> f26208W0;

    /* renamed from: X0 */
    public java.lang.ref.WeakReference<p381w.C6763d> f26209X0;

    /* renamed from: Y0 */
    public java.lang.ref.WeakReference<p381w.C6763d> f26210Y0;

    /* renamed from: Z0 */
    public java.lang.ref.WeakReference<p381w.C6763d> f26211Z0;

    /* renamed from: a1 */
    public p401x.C6894b.a f26212a1;

    public C6766g() {
            r4 = this;
            r4.<init>()
            x.b r0 = new x.b
            r0.<init>(r4)
            r4.f26194I0 = r0
            x.e r0 = new x.e
            r0.<init>(r4)
            r4.f26195J0 = r0
            r0 = 0
            r4.f26196K0 = r0
            r1 = 0
            r4.f26197L0 = r1
            v.d r2 = new v.d
            r2.<init>()
            r4.f26198M0 = r2
            r4.f26201P0 = r1
            r4.f26202Q0 = r1
            r2 = 4
            w.c[] r3 = new p381w.C6762c[r2]
            r4.f26203R0 = r3
            w.c[] r2 = new p381w.C6762c[r2]
            r4.f26204S0 = r2
            r2 = 257(0x101, float:3.6E-43)
            r4.f26205T0 = r2
            r4.f26206U0 = r1
            r4.f26207V0 = r1
            r4.f26208W0 = r0
            r4.f26209X0 = r0
            r4.f26210Y0 = r0
            r4.f26211Z0 = r0
            x.b$a r0 = new x.b$a
            r0.<init>()
            r4.f26212a1 = r0
            return
    }

    /* renamed from: a0 */
    public static boolean m13727a0(p381w.C6765f r9, p401x.C6894b.b r10, p401x.C6894b.a r11, int r12) {
            w.f$a r0 = p381w.C6765f.a.f26190Z
            w.f$a r1 = p381w.C6765f.a.f26189Y
            r2 = 0
            if (r10 != 0) goto L8
            return r2
        L8:
            w.f$a r3 = r9.m13716p()
            r11.f26799a = r3
            w.f$a r3 = r9.m13720t()
            r11.f26800b = r3
            int r3 = r9.m13721u()
            r11.f26801c = r3
            int r3 = r9.m13715o()
            r11.f26802d = r3
            r11.f26807i = r2
            r11.f26808j = r12
            w.f$a r12 = r11.f26799a
            w.f$a r3 = p381w.C6765f.a.f26191a0
            r4 = 1
            if (r12 != r3) goto L2d
            r12 = 1
            goto L2e
        L2d:
            r12 = 0
        L2e:
            w.f$a r5 = r11.f26800b
            if (r5 != r3) goto L34
            r3 = 1
            goto L35
        L34:
            r3 = 0
        L35:
            r5 = 0
            if (r12 == 0) goto L40
            float r6 = r9.f26131U
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 <= 0) goto L40
            r6 = 1
            goto L41
        L40:
            r6 = 0
        L41:
            if (r3 == 0) goto L4b
            float r7 = r9.f26131U
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L4b
            r5 = 1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            if (r12 == 0) goto L65
            boolean r7 = r9.m13724x(r2)
            if (r7 == 0) goto L65
            int r7 = r9.f26159l
            if (r7 != 0) goto L65
            if (r6 != 0) goto L65
            r11.f26799a = r0
            if (r3 == 0) goto L64
            int r12 = r9.f26161m
            if (r12 != 0) goto L64
            r11.f26799a = r1
        L64:
            r12 = 0
        L65:
            if (r3 == 0) goto L7e
            boolean r7 = r9.m13724x(r4)
            if (r7 == 0) goto L7e
            int r7 = r9.f26161m
            if (r7 != 0) goto L7e
            if (r5 != 0) goto L7e
            r11.f26800b = r0
            if (r12 == 0) goto L7d
            int r3 = r9.f26159l
            if (r3 != 0) goto L7d
            r11.f26800b = r1
        L7d:
            r3 = 0
        L7e:
            boolean r7 = r9.mo13670C()
            if (r7 == 0) goto L87
            r11.f26799a = r1
            r12 = 0
        L87:
            boolean r7 = r9.mo13671D()
            if (r7 == 0) goto L90
            r11.f26800b = r1
            r3 = 0
        L90:
            r7 = -1
            r8 = 4
            if (r6 == 0) goto Lc6
            int[] r6 = r9.f26163n
            r6 = r6[r2]
            if (r6 != r8) goto L9d
            r11.f26799a = r1
            goto Lc6
        L9d:
            if (r3 != 0) goto Lc6
            w.f$a r3 = r11.f26800b
            if (r3 != r1) goto La6
            int r3 = r11.f26802d
            goto Lb0
        La6:
            r11.f26799a = r0
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout$b r3 = (androidx.constraintlayout.widget.ConstraintLayout.C0331b) r3
            r3.m934b(r9, r11)
            int r3 = r11.f26804f
        Lb0:
            r11.f26799a = r1
            int r6 = r9.f26132V
            if (r6 == 0) goto Lbe
            if (r6 != r7) goto Lb9
            goto Lbe
        Lb9:
            float r6 = r9.f26131U
            float r3 = (float) r3
            float r6 = r6 / r3
            goto Lc3
        Lbe:
            float r6 = r9.f26131U
            float r3 = (float) r3
            float r6 = r6 * r3
        Lc3:
            int r3 = (int) r6
            r11.f26801c = r3
        Lc6:
            if (r5 == 0) goto Lfa
            int[] r3 = r9.f26163n
            r3 = r3[r4]
            if (r3 != r8) goto Ld1
            r11.f26800b = r1
            goto Lfa
        Ld1:
            if (r12 != 0) goto Lfa
            w.f$a r12 = r11.f26799a
            if (r12 != r1) goto Lda
            int r12 = r11.f26801c
            goto Le4
        Lda:
            r11.f26800b = r0
            r12 = r10
            androidx.constraintlayout.widget.ConstraintLayout$b r12 = (androidx.constraintlayout.widget.ConstraintLayout.C0331b) r12
            r12.m934b(r9, r11)
            int r12 = r11.f26803e
        Le4:
            r11.f26800b = r1
            int r0 = r9.f26132V
            if (r0 == 0) goto Lf3
            if (r0 != r7) goto Led
            goto Lf3
        Led:
            float r12 = (float) r12
            float r0 = r9.f26131U
            float r12 = r12 * r0
            goto Lf7
        Lf3:
            float r12 = (float) r12
            float r0 = r9.f26131U
            float r12 = r12 / r0
        Lf7:
            int r12 = (int) r12
            r11.f26802d = r12
        Lfa:
            androidx.constraintlayout.widget.ConstraintLayout$b r10 = (androidx.constraintlayout.widget.ConstraintLayout.C0331b) r10
            r10.m934b(r9, r11)
            int r10 = r11.f26803e
            r9.m13704P(r10)
            int r10 = r11.f26804f
            r9.m13699K(r10)
            boolean r10 = r11.f26806h
            r9.f26104A = r10
            int r10 = r11.f26805g
            r9.m13696H(r10)
            r11.f26808j = r2
            boolean r9 = r11.f26807i
            return r9
    }

    @Override // p381w.C6773n, p381w.C6765f
    /* renamed from: E */
    public void mo13693E() {
            r1 = this;
            v.d r0 = r1.f26198M0
            r0.m13143u()
            r0 = 0
            r1.f26199N0 = r0
            r1.f26200O0 = r0
            super.mo13693E()
            return
    }

    @Override // p381w.C6765f
    /* renamed from: Q */
    public void mo13705Q(boolean r4, boolean r5) {
            r3 = this;
            super.mo13705Q(r4, r5)
            java.util.ArrayList<w.f> r0 = r3.f26243H0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<w.f> r2 = r3.f26243H0
            java.lang.Object r2 = r2.get(r1)
            w.f r2 = (p381w.C6765f) r2
            r2.mo13705Q(r4, r5)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // p381w.C6773n
    /* renamed from: S */
    public void mo13728S() {
            r27 = this;
            r1 = r27
            w.f$a r0 = p381w.C6765f.a.f26191a0
            w.f$a r2 = p381w.C6765f.a.f26190Z
            w.f$a r3 = p381w.C6765f.a.f26189Y
            r4 = 0
            r1.f26133W = r4
            r1.f26134X = r4
            r1.f26206U0 = r4
            r1.f26207V0 = r4
            java.util.ArrayList<w.f> r5 = r1.f26243H0
            int r5 = r5.size()
            int r6 = r27.m13721u()
            int r6 = java.lang.Math.max(r4, r6)
            int r7 = r27.m13715o()
            int r7 = java.lang.Math.max(r4, r7)
            w.f$a[] r8 = r1.f26127Q
            r9 = 1
            r10 = r8[r9]
            r8 = r8[r4]
            int r11 = r1.f26205T0
            boolean r11 = p381w.C6771l.m13746b(r11, r9)
            if (r11 == 0) goto L23a
            x.b$b r11 = r1.f26196K0
            w.f$a r12 = r27.m13716p()
            w.f$a r13 = r27.m13720t()
            r27.m13694F()
            java.util.ArrayList<w.f> r14 = r1.f26243H0
            int r15 = r14.size()
            r9 = 0
        L4a:
            if (r9 >= r15) goto L58
            java.lang.Object r16 = r14.get(r9)
            w.f r16 = (p381w.C6765f) r16
            r16.m13694F()
            int r9 = r9 + 1
            goto L4a
        L58:
            boolean r9 = r1.f26197L0
            if (r12 != r3) goto L66
            int r12 = r27.m13721u()
            r1.m13697I(r4, r12)
            r16 = r7
            goto L71
        L66:
            w.d r12 = r1.f26114F
            r12.f26087b = r4
            r16 = r7
            r7 = 1
            r12.f26088c = r7
            r1.f26133W = r4
        L71:
            r7 = 0
            r12 = 0
            r17 = 0
        L75:
            r18 = 1056964608(0x3f000000, float:0.5)
            if (r12 >= r15) goto Ld7
            java.lang.Object r19 = r14.get(r12)
            r4 = r19
            w.f r4 = (p381w.C6765f) r4
            r19 = r6
            boolean r6 = r4 instanceof p381w.C6768i
            if (r6 == 0) goto Lbf
            w.i r4 = (p381w.C6768i) r4
            int r6 = r4.f26237L0
            r21 = r10
            r10 = 1
            if (r6 != r10) goto Lcf
            int r6 = r4.f26234I0
            r7 = -1
            if (r6 == r7) goto L96
            goto Lba
        L96:
            int r6 = r4.f26235J0
            if (r6 == r7) goto La8
            boolean r6 = r27.mo13670C()
            if (r6 == 0) goto La8
            int r6 = r27.m13721u()
            int r7 = r4.f26235J0
            int r6 = r6 - r7
            goto Lba
        La8:
            boolean r6 = r27.mo13670C()
            if (r6 == 0) goto Lbd
            float r6 = r4.f26233H0
            int r7 = r27.m13721u()
            float r7 = (float) r7
            float r6 = r6 * r7
            float r6 = r6 + r18
            int r6 = (int) r6
        Lba:
            r4.m13739S(r6)
        Lbd:
            r7 = 1
            goto Lcf
        Lbf:
            r21 = r10
            boolean r6 = r4 instanceof p381w.C6760a
            if (r6 == 0) goto Lcf
            w.a r4 = (p381w.C6760a) r4
            int r4 = r4.m13673U()
            if (r4 != 0) goto Lcf
            r17 = 1
        Lcf:
            int r12 = r12 + 1
            r6 = r19
            r10 = r21
            r4 = 0
            goto L75
        Ld7:
            r19 = r6
            r21 = r10
            if (r7 == 0) goto Lf7
            r4 = 0
        Lde:
            if (r4 >= r15) goto Lf7
            java.lang.Object r6 = r14.get(r4)
            w.f r6 = (p381w.C6765f) r6
            boolean r7 = r6 instanceof p381w.C6768i
            if (r7 == 0) goto Lf4
            w.i r6 = (p381w.C6768i) r6
            int r7 = r6.f26237L0
            r10 = 1
            if (r7 != r10) goto Lf4
            p401x.C6900h.m13982b(r6, r11, r9)
        Lf4:
            int r4 = r4 + 1
            goto Lde
        Lf7:
            p401x.C6900h.m13982b(r1, r11, r9)
            if (r17 == 0) goto L11d
            r4 = 0
        Lfd:
            if (r4 >= r15) goto L11d
            java.lang.Object r6 = r14.get(r4)
            w.f r6 = (p381w.C6765f) r6
            boolean r7 = r6 instanceof p381w.C6760a
            if (r7 == 0) goto L11a
            w.a r6 = (p381w.C6760a) r6
            int r7 = r6.m13673U()
            if (r7 != 0) goto L11a
            boolean r7 = r6.m13672T()
            if (r7 == 0) goto L11a
            p401x.C6900h.m13982b(r6, r11, r9)
        L11a:
            int r4 = r4 + 1
            goto Lfd
        L11d:
            if (r13 != r3) goto L128
            int r4 = r27.m13715o()
            r6 = 0
            r1.m13698J(r6, r4)
            goto L132
        L128:
            r6 = 0
            w.d r4 = r1.f26116G
            r4.f26087b = r6
            r7 = 1
            r4.f26088c = r7
            r1.f26134X = r6
        L132:
            r4 = 0
            r6 = 0
            r7 = 0
        L135:
            if (r7 >= r15) goto L18a
            java.lang.Object r10 = r14.get(r7)
            w.f r10 = (p381w.C6765f) r10
            boolean r12 = r10 instanceof p381w.C6768i
            if (r12 == 0) goto L178
            w.i r10 = (p381w.C6768i) r10
            int r12 = r10.f26237L0
            if (r12 != 0) goto L176
            int r4 = r10.f26234I0
            r12 = -1
            if (r4 == r12) goto L14d
            goto L171
        L14d:
            int r4 = r10.f26235J0
            if (r4 == r12) goto L15f
            boolean r4 = r27.mo13671D()
            if (r4 == 0) goto L15f
            int r4 = r27.m13715o()
            int r13 = r10.f26235J0
            int r4 = r4 - r13
            goto L171
        L15f:
            boolean r4 = r27.mo13671D()
            if (r4 == 0) goto L174
            float r4 = r10.f26233H0
            int r13 = r27.m13715o()
            float r13 = (float) r13
            float r4 = r4 * r13
            float r4 = r4 + r18
            int r4 = (int) r4
        L171:
            r10.m13739S(r4)
        L174:
            r4 = 1
            goto L187
        L176:
            r12 = -1
            goto L187
        L178:
            r12 = -1
            boolean r13 = r10 instanceof p381w.C6760a
            if (r13 == 0) goto L187
            w.a r10 = (p381w.C6760a) r10
            int r10 = r10.m13673U()
            r13 = 1
            if (r10 != r13) goto L187
            r6 = 1
        L187:
            int r7 = r7 + 1
            goto L135
        L18a:
            if (r4 == 0) goto L1a5
            r4 = 0
        L18d:
            if (r4 >= r15) goto L1a5
            java.lang.Object r7 = r14.get(r4)
            w.f r7 = (p381w.C6765f) r7
            boolean r10 = r7 instanceof p381w.C6768i
            if (r10 == 0) goto L1a2
            w.i r7 = (p381w.C6768i) r7
            int r10 = r7.f26237L0
            if (r10 != 0) goto L1a2
            p401x.C6900h.m13987g(r7, r11)
        L1a2:
            int r4 = r4 + 1
            goto L18d
        L1a5:
            p401x.C6900h.m13987g(r1, r11)
            if (r6 == 0) goto L1cc
            r4 = 0
        L1ab:
            if (r4 >= r15) goto L1cc
            java.lang.Object r6 = r14.get(r4)
            w.f r6 = (p381w.C6765f) r6
            boolean r7 = r6 instanceof p381w.C6760a
            if (r7 == 0) goto L1c9
            w.a r6 = (p381w.C6760a) r6
            int r7 = r6.m13673U()
            r10 = 1
            if (r7 != r10) goto L1c9
            boolean r7 = r6.m13672T()
            if (r7 == 0) goto L1c9
            p401x.C6900h.m13987g(r6, r11)
        L1c9:
            int r4 = r4 + 1
            goto L1ab
        L1cc:
            r4 = 0
        L1cd:
            if (r4 >= r15) goto L1f0
            java.lang.Object r6 = r14.get(r4)
            w.f r6 = (p381w.C6765f) r6
            boolean r7 = r6.m13692B()
            if (r7 == 0) goto L1ed
            boolean r7 = p401x.C6900h.m13981a(r6)
            if (r7 == 0) goto L1ed
            x.b$a r7 = p401x.C6900h.f26841a
            r10 = 0
            m13727a0(r6, r11, r7, r10)
            p401x.C6900h.m13982b(r6, r11, r9)
            p401x.C6900h.m13987g(r6, r11)
        L1ed:
            int r4 = r4 + 1
            goto L1cd
        L1f0:
            r4 = 0
        L1f1:
            if (r4 >= r5) goto L240
            java.util.ArrayList<w.f> r6 = r1.f26243H0
            java.lang.Object r6 = r6.get(r4)
            w.f r6 = (p381w.C6765f) r6
            boolean r7 = r6.m13692B()
            if (r7 == 0) goto L237
            boolean r7 = r6 instanceof p381w.C6768i
            if (r7 != 0) goto L237
            boolean r7 = r6 instanceof p381w.C6760a
            if (r7 != 0) goto L237
            boolean r7 = r6 instanceof p381w.C6772m
            if (r7 != 0) goto L237
            boolean r7 = r6.f26108C
            if (r7 != 0) goto L237
            r7 = 0
            w.f$a r9 = r6.m13714n(r7)
            r7 = 1
            w.f$a r10 = r6.m13714n(r7)
            if (r9 != r0) goto L229
            int r9 = r6.f26159l
            if (r9 == r7) goto L229
            if (r10 != r0) goto L229
            int r9 = r6.f26161m
            if (r9 == r7) goto L229
            r7 = 1
            goto L22a
        L229:
            r7 = 0
        L22a:
            if (r7 != 0) goto L237
            x.b$a r7 = new x.b$a
            r7.<init>()
            x.b$b r9 = r1.f26196K0
            r10 = 0
            m13727a0(r6, r9, r7, r10)
        L237:
            int r4 = r4 + 1
            goto L1f1
        L23a:
            r19 = r6
            r16 = r7
            r21 = r10
        L240:
            r4 = 2
            if (r5 <= r4) goto L62d
            r7 = r21
            if (r8 == r2) goto L249
            if (r7 != r2) goto L621
        L249:
            int r9 = r1.f26205T0
            r10 = 1024(0x400, float:1.435E-42)
            boolean r9 = p381w.C6771l.m13746b(r9, r10)
            if (r9 == 0) goto L621
            x.b$b r9 = r1.f26196K0
            w.d$a r10 = p381w.C6763d.a.f26100d0
            java.util.ArrayList<w.f> r11 = r1.f26243H0
            int r12 = r11.size()
            r13 = 0
        L25e:
            if (r13 >= r12) goto L292
            java.lang.Object r14 = r11.get(r13)
            w.f r14 = (p381w.C6765f) r14
            w.f$a r15 = r27.m13716p()
            w.f$a r4 = r27.m13720t()
            w.f$a r6 = r14.m13716p()
            r20 = r5
            w.f$a r5 = r14.m13720t()
            boolean r4 = p401x.C6901i.m13990c(r15, r4, r6, r5)
            if (r4 != 0) goto L27f
            goto L283
        L27f:
            boolean r4 = r14 instanceof p381w.C6767h
            if (r4 == 0) goto L28c
        L283:
            r4 = r2
            r22 = r3
            r21 = r7
            r23 = r8
            goto L5d8
        L28c:
            int r13 = r13 + 1
            r5 = r20
            r4 = 2
            goto L25e
        L292:
            r20 = r5
            r21 = r7
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L29d:
            if (r7 >= r12) goto L381
            java.lang.Object r22 = r11.get(r7)
            r23 = r8
            r8 = r22
            w.f r8 = (p381w.C6765f) r8
            r22 = r3
            w.f$a r3 = r27.m13716p()
            r24 = r2
            w.f$a r2 = r27.m13720t()
            r25 = r0
            w.f$a r0 = r8.m13716p()
            r26 = r11
            w.f$a r11 = r8.m13720t()
            boolean r0 = p401x.C6901i.m13990c(r3, r2, r0, r11)
            if (r0 != 0) goto L2cd
            x.b$a r0 = r1.f26212a1
            r2 = 0
            m13727a0(r8, r9, r0, r2)
        L2cd:
            boolean r0 = r8 instanceof p381w.C6768i
            if (r0 == 0) goto L2f2
            r2 = r8
            w.i r2 = (p381w.C6768i) r2
            int r3 = r2.f26237L0
            if (r3 != 0) goto L2e3
            if (r6 != 0) goto L2e0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L2e0:
            r6.add(r2)
        L2e3:
            int r3 = r2.f26237L0
            r11 = 1
            if (r3 != r11) goto L2f2
            if (r4 != 0) goto L2ef
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L2ef:
            r4.add(r2)
        L2f2:
            boolean r2 = r8 instanceof p381w.C6770k
            if (r2 == 0) goto L335
            boolean r2 = r8 instanceof p381w.C6760a
            if (r2 == 0) goto L31d
            r2 = r8
            w.a r2 = (p381w.C6760a) r2
            int r3 = r2.m13673U()
            if (r3 != 0) goto L30e
            if (r5 != 0) goto L30b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = r3
        L30b:
            r5.add(r2)
        L30e:
            int r3 = r2.m13673U()
            r11 = 1
            if (r3 != r11) goto L335
            if (r13 != 0) goto L332
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L331
        L31d:
            r2 = r8
            w.k r2 = (p381w.C6770k) r2
            if (r5 != 0) goto L327
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L327:
            r5.add(r2)
            if (r13 != 0) goto L332
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L331:
            r13 = r3
        L332:
            r13.add(r2)
        L335:
            w.d r2 = r8.f26114F
            w.d r2 = r2.f26091f
            if (r2 != 0) goto L351
            w.d r2 = r8.f26118H
            w.d r2 = r2.f26091f
            if (r2 != 0) goto L351
            if (r0 != 0) goto L351
            boolean r2 = r8 instanceof p381w.C6760a
            if (r2 != 0) goto L351
            if (r14 != 0) goto L34e
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L34e:
            r14.add(r8)
        L351:
            w.d r2 = r8.f26116G
            w.d r2 = r2.f26091f
            if (r2 != 0) goto L373
            w.d r2 = r8.f26119I
            w.d r2 = r2.f26091f
            if (r2 != 0) goto L373
            w.d r2 = r8.f26120J
            w.d r2 = r2.f26091f
            if (r2 != 0) goto L373
            if (r0 != 0) goto L373
            boolean r0 = r8 instanceof p381w.C6760a
            if (r0 != 0) goto L373
            if (r15 != 0) goto L370
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L370:
            r15.add(r8)
        L373:
            int r7 = r7 + 1
            r3 = r22
            r8 = r23
            r2 = r24
            r0 = r25
            r11 = r26
            goto L29d
        L381:
            r25 = r0
            r24 = r2
            r22 = r3
            r23 = r8
            r26 = r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L3a8
            java.util.Iterator r2 = r4.iterator()
        L396:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a8
            java.lang.Object r3 = r2.next()
            w.i r3 = (p381w.C6768i) r3
            r4 = 0
            r7 = 0
            p401x.C6901i.m13988a(r3, r7, r0, r4)
            goto L396
        L3a8:
            r4 = 0
            r7 = 0
            if (r5 == 0) goto L3c9
            java.util.Iterator r2 = r5.iterator()
        L3b0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3c9
            java.lang.Object r3 = r2.next()
            w.k r3 = (p381w.C6770k) r3
            x.o r5 = p401x.C6901i.m13988a(r3, r7, r0, r4)
            r3.m13744S(r0, r7, r5)
            r5.m13999b(r0)
            r4 = 0
            r7 = 0
            goto L3b0
        L3c9:
            w.d$a r2 = p381w.C6763d.a.f26095Y
            w.d r2 = r1.mo13712l(r2)
            java.util.HashSet<w.d> r2 = r2.f26086a
            if (r2 == 0) goto L3eb
            java.util.Iterator r2 = r2.iterator()
        L3d7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3eb
            java.lang.Object r3 = r2.next()
            w.d r3 = (p381w.C6763d) r3
            w.f r3 = r3.f26089d
            r4 = 0
            r5 = 0
            p401x.C6901i.m13988a(r3, r5, r0, r4)
            goto L3d7
        L3eb:
            w.d$a r2 = p381w.C6763d.a.f26097a0
            w.d r2 = r1.mo13712l(r2)
            java.util.HashSet<w.d> r2 = r2.f26086a
            if (r2 == 0) goto L40d
            java.util.Iterator r2 = r2.iterator()
        L3f9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40d
            java.lang.Object r3 = r2.next()
            w.d r3 = (p381w.C6763d) r3
            w.f r3 = r3.f26089d
            r4 = 0
            r5 = 0
            p401x.C6901i.m13988a(r3, r5, r0, r4)
            goto L3f9
        L40d:
            w.d r2 = r1.mo13712l(r10)
            java.util.HashSet<w.d> r2 = r2.f26086a
            if (r2 == 0) goto L42d
            java.util.Iterator r2 = r2.iterator()
        L419:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42d
            java.lang.Object r3 = r2.next()
            w.d r3 = (p381w.C6763d) r3
            w.f r3 = r3.f26089d
            r4 = 0
            r5 = 0
            p401x.C6901i.m13988a(r3, r5, r0, r4)
            goto L419
        L42d:
            r4 = 0
            r5 = 0
            if (r14 == 0) goto L445
            java.util.Iterator r2 = r14.iterator()
        L435:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L445
            java.lang.Object r3 = r2.next()
            w.f r3 = (p381w.C6765f) r3
            p401x.C6901i.m13988a(r3, r5, r0, r4)
            goto L435
        L445:
            if (r6 == 0) goto L45c
            java.util.Iterator r2 = r6.iterator()
        L44b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45c
            java.lang.Object r3 = r2.next()
            w.i r3 = (p381w.C6768i) r3
            r5 = 1
            p401x.C6901i.m13988a(r3, r5, r0, r4)
            goto L44b
        L45c:
            r5 = 1
            if (r13 == 0) goto L47c
            java.util.Iterator r2 = r13.iterator()
        L463:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L47c
            java.lang.Object r3 = r2.next()
            w.k r3 = (p381w.C6770k) r3
            x.o r6 = p401x.C6901i.m13988a(r3, r5, r0, r4)
            r3.m13744S(r0, r5, r6)
            r6.m13999b(r0)
            r4 = 0
            r5 = 1
            goto L463
        L47c:
            w.d$a r2 = p381w.C6763d.a.f26096Z
            w.d r2 = r1.mo13712l(r2)
            java.util.HashSet<w.d> r2 = r2.f26086a
            if (r2 == 0) goto L49e
            java.util.Iterator r2 = r2.iterator()
        L48a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L49e
            java.lang.Object r3 = r2.next()
            w.d r3 = (p381w.C6763d) r3
            w.f r3 = r3.f26089d
            r4 = 0
            r5 = 1
            p401x.C6901i.m13988a(r3, r5, r0, r4)
            goto L48a
        L49e:
            w.d$a r2 = p381w.C6763d.a.f26099c0
            w.d r2 = r1.mo13712l(r2)
            java.util.HashSet<w.d> r2 = r2.f26086a
            if (r2 == 0) goto L4c0
            java.util.Iterator r2 = r2.iterator()
        L4ac:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4c0
            java.lang.Object r3 = r2.next()
            w.d r3 = (p381w.C6763d) r3
            w.f r3 = r3.f26089d
            r4 = 0
            r5 = 1
            p401x.C6901i.m13988a(r3, r5, r0, r4)
            goto L4ac
        L4c0:
            w.d$a r2 = p381w.C6763d.a.f26098b0
            w.d r2 = r1.mo13712l(r2)
            java.util.HashSet<w.d> r2 = r2.f26086a
            if (r2 == 0) goto L4e2
            java.util.Iterator r2 = r2.iterator()
        L4ce:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4e2
            java.lang.Object r3 = r2.next()
            w.d r3 = (p381w.C6763d) r3
            w.f r3 = r3.f26089d
            r4 = 0
            r5 = 1
            p401x.C6901i.m13988a(r3, r5, r0, r4)
            goto L4ce
        L4e2:
            w.d r2 = r1.mo13712l(r10)
            java.util.HashSet<w.d> r2 = r2.f26086a
            if (r2 == 0) goto L502
            java.util.Iterator r2 = r2.iterator()
        L4ee:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L502
            java.lang.Object r3 = r2.next()
            w.d r3 = (p381w.C6763d) r3
            w.f r3 = r3.f26089d
            r4 = 0
            r5 = 1
            p401x.C6901i.m13988a(r3, r5, r0, r4)
            goto L4ee
        L502:
            r4 = 0
            r5 = 1
            if (r15 == 0) goto L51a
            java.util.Iterator r2 = r15.iterator()
        L50a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L51a
            java.lang.Object r3 = r2.next()
            w.f r3 = (p381w.C6765f) r3
            p401x.C6901i.m13988a(r3, r5, r0, r4)
            goto L50a
        L51a:
            r2 = 0
        L51b:
            if (r2 >= r12) goto L559
            r3 = r26
            java.lang.Object r4 = r3.get(r2)
            w.f r4 = (p381w.C6765f) r4
            w.f$a[] r6 = r4.f26127Q
            r7 = 0
            r8 = r6[r7]
            r7 = r25
            if (r8 != r7) goto L534
            r6 = r6[r5]
            if (r6 != r7) goto L534
            r5 = 1
            goto L535
        L534:
            r5 = 0
        L535:
            if (r5 == 0) goto L551
            int r5 = r4.f26115F0
            x.o r5 = p401x.C6901i.m13989b(r0, r5)
            int r4 = r4.f26117G0
            x.o r4 = p401x.C6901i.m13989b(r0, r4)
            if (r5 == 0) goto L551
            if (r4 == 0) goto L551
            r6 = 0
            r5.m14001d(r6, r4)
            r6 = 2
            r4.f26851c = r6
            r0.remove(r5)
        L551:
            int r2 = r2 + 1
            r26 = r3
            r25 = r7
            r5 = 1
            goto L51b
        L559:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L564
            r4 = r24
            goto L5d8
        L564:
            w.f$a r2 = r27.m13716p()
            r4 = r24
            if (r2 != r4) goto L59c
            java.util.Iterator r2 = r0.iterator()
            r5 = 0
            r6 = 0
        L572:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L591
            java.lang.Object r7 = r2.next()
            x.o r7 = (p401x.C6907o) r7
            int r8 = r7.f26851c
            if (r8 != r3) goto L584
            r8 = 0
            goto L58f
        L584:
            v.d r3 = r1.f26198M0
            r8 = 0
            int r3 = r7.m14000c(r3, r8)
            if (r3 <= r6) goto L58f
            r6 = r3
            r5 = r7
        L58f:
            r3 = 1
            goto L572
        L591:
            r8 = 0
            if (r5 == 0) goto L59c
            w.f$a[] r2 = r1.f26127Q
            r2[r8] = r22
            r1.m13704P(r6)
            goto L59d
        L59c:
            r5 = 0
        L59d:
            w.f$a r2 = r27.m13720t()
            if (r2 != r4) goto L5d2
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L5a9:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L5c7
            java.lang.Object r6 = r0.next()
            x.o r6 = (p401x.C6907o) r6
            int r7 = r6.f26851c
            if (r7 != 0) goto L5bb
            r8 = 1
            goto L5a9
        L5bb:
            v.d r7 = r1.f26198M0
            r8 = 1
            int r7 = r6.m14000c(r7, r8)
            if (r7 <= r3) goto L5a9
            r2 = r6
            r3 = r7
            goto L5a9
        L5c7:
            r8 = 1
            if (r2 == 0) goto L5d2
            w.f$a[] r0 = r1.f26127Q
            r0[r8] = r22
            r1.m13699K(r3)
            goto L5d3
        L5d2:
            r2 = 0
        L5d3:
            if (r5 != 0) goto L5da
            if (r2 == 0) goto L5d8
            goto L5da
        L5d8:
            r0 = 0
            goto L5db
        L5da:
            r0 = 1
        L5db:
            if (r0 == 0) goto L618
            r2 = r23
            if (r2 != r4) goto L5f7
            int r0 = r27.m13721u()
            r3 = r19
            if (r3 >= r0) goto L5f2
            if (r3 <= 0) goto L5f2
            r1.m13704P(r3)
            r5 = 1
            r1.f26206U0 = r5
            goto L5f9
        L5f2:
            int r6 = r27.m13721u()
            goto L5fa
        L5f7:
            r3 = r19
        L5f9:
            r6 = r3
        L5fa:
            r5 = r21
            if (r5 != r4) goto L614
            int r0 = r27.m13715o()
            r7 = r16
            if (r7 >= r0) goto L60f
            if (r7 <= 0) goto L60f
            r1.m13699K(r7)
            r3 = 1
            r1.f26207V0 = r3
            goto L616
        L60f:
            int r7 = r27.m13715o()
            goto L616
        L614:
            r7 = r16
        L616:
            r0 = 1
            goto L63b
        L618:
            r7 = r16
            r3 = r19
            r5 = r21
            r2 = r23
            goto L639
        L621:
            r4 = r2
            r22 = r3
            r20 = r5
            r5 = r7
            r2 = r8
            r7 = r16
            r3 = r19
            goto L639
        L62d:
            r4 = r2
            r22 = r3
            r20 = r5
            r2 = r8
            r7 = r16
            r3 = r19
            r5 = r21
        L639:
            r6 = r3
            r0 = 0
        L63b:
            r3 = 64
            boolean r8 = r1.m13736b0(r3)
            if (r8 != 0) goto L64e
            r8 = 128(0x80, float:1.8E-43)
            boolean r8 = r1.m13736b0(r8)
            if (r8 == 0) goto L64c
            goto L64e
        L64c:
            r8 = 0
            goto L64f
        L64e:
            r8 = 1
        L64f:
            v.d r9 = r1.f26198M0
            java.util.Objects.requireNonNull(r9)
            r10 = 0
            r9.f25088g = r10
            int r10 = r1.f26205T0
            if (r10 == 0) goto L660
            if (r8 == 0) goto L660
            r8 = 1
            r9.f25088g = r8
        L660:
            java.util.ArrayList<w.f> r8 = r1.f26243H0
            w.f$a r9 = r27.m13716p()
            if (r9 == r4) goto L671
            w.f$a r9 = r27.m13720t()
            if (r9 != r4) goto L66f
            goto L671
        L66f:
            r9 = 0
            goto L672
        L671:
            r9 = 1
        L672:
            r10 = 0
            r1.f26201P0 = r10
            r1.f26202Q0 = r10
            r11 = r20
            r10 = 0
        L67a:
            if (r10 >= r11) goto L690
            java.util.ArrayList<w.f> r12 = r1.f26243H0
            java.lang.Object r12 = r12.get(r10)
            w.f r12 = (p381w.C6765f) r12
            boolean r13 = r12 instanceof p381w.C6773n
            if (r13 == 0) goto L68d
            w.n r12 = (p381w.C6773n) r12
            r12.mo13728S()
        L68d:
            int r10 = r10 + 1
            goto L67a
        L690:
            boolean r10 = r1.m13736b0(r3)
            r12 = r0
            r0 = 0
            r13 = 1
        L697:
            if (r13 == 0) goto L8c6
            r14 = 1
            int r15 = r0 + 1
            v.d r0 = r1.f26198M0     // Catch: java.lang.Exception -> L785
            r0.m13143u()     // Catch: java.lang.Exception -> L785
            r14 = 0
            r1.f26201P0 = r14     // Catch: java.lang.Exception -> L785
            r1.f26202Q0 = r14     // Catch: java.lang.Exception -> L785
            v.d r0 = r1.f26198M0     // Catch: java.lang.Exception -> L785
            r1.m13710j(r0)     // Catch: java.lang.Exception -> L785
            r0 = 0
        L6ac:
            if (r0 >= r11) goto L6c0
            java.util.ArrayList<w.f> r14 = r1.f26243H0     // Catch: java.lang.Exception -> L785
            java.lang.Object r14 = r14.get(r0)     // Catch: java.lang.Exception -> L785
            w.f r14 = (p381w.C6765f) r14     // Catch: java.lang.Exception -> L785
            v.d r3 = r1.f26198M0     // Catch: java.lang.Exception -> L785
            r14.m13710j(r3)     // Catch: java.lang.Exception -> L785
            int r0 = r0 + 1
            r3 = 64
            goto L6ac
        L6c0:
            v.d r0 = r1.f26198M0     // Catch: java.lang.Exception -> L785
            r1.m13730U(r0)     // Catch: java.lang.Exception -> L785
            java.lang.ref.WeakReference<w.d> r0 = r1.f26208W0     // Catch: java.lang.Exception -> L77f
            r3 = 5
            if (r0 == 0) goto L6f2
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L77f
            if (r0 == 0) goto L6f2
            java.lang.ref.WeakReference<w.d> r0 = r1.f26208W0     // Catch: java.lang.Exception -> L77f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L77f
            w.d r0 = (p381w.C6763d) r0     // Catch: java.lang.Exception -> L77f
            v.d r13 = r1.f26198M0     // Catch: java.lang.Exception -> L77f
            w.d r14 = r1.f26116G     // Catch: java.lang.Exception -> L77f
            v.h r13 = r13.m13134l(r14)     // Catch: java.lang.Exception -> L77f
            v.d r14 = r1.f26198M0     // Catch: java.lang.Exception -> L77f
            v.h r0 = r14.m13134l(r0)     // Catch: java.lang.Exception -> L77f
            v.d r14 = r1.f26198M0     // Catch: java.lang.Exception -> L77f
            r19 = r12
            r12 = 0
            r14.m13128f(r0, r13, r12, r3)     // Catch: java.lang.Exception -> L773
            r12 = 0
            r1.f26208W0 = r12     // Catch: java.lang.Exception -> L773
            goto L6f4
        L6f2:
            r19 = r12
        L6f4:
            java.lang.ref.WeakReference<w.d> r0 = r1.f26210Y0     // Catch: java.lang.Exception -> L773
            if (r0 == 0) goto L71d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L773
            if (r0 == 0) goto L71d
            java.lang.ref.WeakReference<w.d> r0 = r1.f26210Y0     // Catch: java.lang.Exception -> L773
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L773
            w.d r0 = (p381w.C6763d) r0     // Catch: java.lang.Exception -> L773
            v.d r12 = r1.f26198M0     // Catch: java.lang.Exception -> L773
            w.d r13 = r1.f26119I     // Catch: java.lang.Exception -> L773
            v.h r12 = r12.m13134l(r13)     // Catch: java.lang.Exception -> L773
            v.d r13 = r1.f26198M0     // Catch: java.lang.Exception -> L773
            v.h r0 = r13.m13134l(r0)     // Catch: java.lang.Exception -> L773
            v.d r13 = r1.f26198M0     // Catch: java.lang.Exception -> L773
            r14 = 0
            r13.m13128f(r12, r0, r14, r3)     // Catch: java.lang.Exception -> L773
            r12 = 0
            r1.f26210Y0 = r12     // Catch: java.lang.Exception -> L773
        L71d:
            java.lang.ref.WeakReference<w.d> r0 = r1.f26209X0     // Catch: java.lang.Exception -> L773
            if (r0 == 0) goto L749
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L773
            if (r0 == 0) goto L749
            java.lang.ref.WeakReference<w.d> r0 = r1.f26209X0     // Catch: java.lang.Exception -> L773
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L773
            w.d r0 = (p381w.C6763d) r0     // Catch: java.lang.Exception -> L773
            v.d r12 = r1.f26198M0     // Catch: java.lang.Exception -> L773
            w.d r13 = r1.f26114F     // Catch: java.lang.Exception -> L773
            v.h r12 = r12.m13134l(r13)     // Catch: java.lang.Exception -> L773
            v.d r13 = r1.f26198M0     // Catch: java.lang.Exception -> L773
            v.h r0 = r13.m13134l(r0)     // Catch: java.lang.Exception -> L773
            v.d r13 = r1.f26198M0     // Catch: java.lang.Exception -> L773
            r14 = 0
            r13.m13128f(r0, r12, r14, r3)     // Catch: java.lang.Exception -> L773
            r12 = 0
            r1.f26209X0 = r12     // Catch: java.lang.Exception -> L773
            goto L749
        L747:
            r3 = 0
            goto L783
        L749:
            java.lang.ref.WeakReference<w.d> r0 = r1.f26211Z0     // Catch: java.lang.Exception -> L773
            if (r0 == 0) goto L775
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L773
            if (r0 == 0) goto L775
            java.lang.ref.WeakReference<w.d> r0 = r1.f26211Z0     // Catch: java.lang.Exception -> L773
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L773
            w.d r0 = (p381w.C6763d) r0     // Catch: java.lang.Exception -> L773
            v.d r12 = r1.f26198M0     // Catch: java.lang.Exception -> L773
            w.d r13 = r1.f26118H     // Catch: java.lang.Exception -> L773
            v.h r12 = r12.m13134l(r13)     // Catch: java.lang.Exception -> L773
            v.d r13 = r1.f26198M0     // Catch: java.lang.Exception -> L773
            v.h r0 = r13.m13134l(r0)     // Catch: java.lang.Exception -> L773
            v.d r13 = r1.f26198M0     // Catch: java.lang.Exception -> L773
            r14 = 0
            r13.m13128f(r12, r0, r14, r3)     // Catch: java.lang.Exception -> L773
            r3 = 0
            r1.f26211Z0 = r3     // Catch: java.lang.Exception -> L77d
            goto L776
        L773:
            r0 = move-exception
            goto L747
        L775:
            r3 = 0
        L776:
            v.d r0 = r1.f26198M0     // Catch: java.lang.Exception -> L77d
            r0.m13139q()     // Catch: java.lang.Exception -> L77d
            r13 = 1
            goto L7a2
        L77d:
            r0 = move-exception
            goto L783
        L77f:
            r0 = move-exception
            r19 = r12
            goto L747
        L783:
            r13 = 1
            goto L789
        L785:
            r0 = move-exception
            r19 = r12
            r3 = 0
        L789:
            r0.printStackTrace()
            java.io.PrintStream r12 = java.lang.System.out
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r3 = "EXCEPTION : "
            r14.append(r3)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            r12.println(r0)
        L7a2:
            v.d r0 = r1.f26198M0
            if (r13 == 0) goto L7ce
            boolean[] r3 = p381w.C6771l.f26241a
            r12 = 2
            r13 = 0
            r3[r12] = r13
            r3 = 64
            boolean r12 = r1.m13736b0(r3)
            r1.mo13706R(r0, r12)
            java.util.ArrayList<w.f> r13 = r1.f26243H0
            int r13 = r13.size()
            r14 = 0
        L7bc:
            if (r14 >= r13) goto L7e4
            java.util.ArrayList<w.f> r3 = r1.f26243H0
            java.lang.Object r3 = r3.get(r14)
            w.f r3 = (p381w.C6765f) r3
            r3.mo13706R(r0, r12)
            int r14 = r14 + 1
            r3 = 64
            goto L7bc
        L7ce:
            r1.mo13706R(r0, r10)
            r0 = 0
        L7d2:
            if (r0 >= r11) goto L7e4
            java.util.ArrayList<w.f> r3 = r1.f26243H0
            java.lang.Object r3 = r3.get(r0)
            w.f r3 = (p381w.C6765f) r3
            v.d r12 = r1.f26198M0
            r3.mo13706R(r12, r10)
            int r0 = r0 + 1
            goto L7d2
        L7e4:
            if (r9 == 0) goto L84e
            r0 = 8
            if (r15 >= r0) goto L84e
            boolean[] r0 = p381w.C6771l.f26241a
            r3 = 2
            boolean r0 = r0[r3]
            if (r0 == 0) goto L84e
            r0 = 0
            r12 = 0
            r13 = 0
        L7f4:
            if (r0 >= r11) goto L819
            java.util.ArrayList<w.f> r14 = r1.f26243H0
            java.lang.Object r14 = r14.get(r0)
            w.f r14 = (p381w.C6765f) r14
            int r3 = r14.f26133W
            int r20 = r14.m13721u()
            int r3 = r20 + r3
            int r12 = java.lang.Math.max(r12, r3)
            int r3 = r14.f26134X
            int r14 = r14.m13715o()
            int r14 = r14 + r3
            int r13 = java.lang.Math.max(r13, r14)
            int r0 = r0 + 1
            r3 = 2
            goto L7f4
        L819:
            int r0 = r1.f26144d0
            int r0 = java.lang.Math.max(r0, r12)
            int r3 = r1.f26146e0
            int r3 = java.lang.Math.max(r3, r13)
            if (r2 != r4) goto L839
            int r12 = r27.m13721u()
            if (r12 >= r0) goto L839
            r1.m13704P(r0)
            w.f$a[] r0 = r1.f26127Q
            r12 = 0
            r0[r12] = r4
            r0 = 1
            r19 = 1
            goto L83a
        L839:
            r0 = 0
        L83a:
            if (r5 != r4) goto L84f
            int r12 = r27.m13715o()
            if (r12 >= r3) goto L84f
            r1.m13699K(r3)
            w.f$a[] r0 = r1.f26127Q
            r3 = 1
            r0[r3] = r4
            r0 = 1
            r19 = 1
            goto L84f
        L84e:
            r0 = 0
        L84f:
            int r3 = r1.f26144d0
            int r12 = r27.m13721u()
            int r3 = java.lang.Math.max(r3, r12)
            int r12 = r27.m13721u()
            if (r3 <= r12) goto L86a
            r1.m13704P(r3)
            w.f$a[] r0 = r1.f26127Q
            r3 = 0
            r0[r3] = r22
            r0 = 1
            r19 = 1
        L86a:
            int r3 = r1.f26146e0
            int r12 = r27.m13715o()
            int r3 = java.lang.Math.max(r3, r12)
            int r12 = r27.m13715o()
            if (r3 <= r12) goto L886
            r1.m13699K(r3)
            w.f$a[] r0 = r1.f26127Q
            r3 = 1
            r0[r3] = r22
            r0 = 1
            r19 = 1
            goto L887
        L886:
            r3 = 1
        L887:
            if (r19 != 0) goto L8be
            w.f$a[] r12 = r1.f26127Q
            r13 = 0
            r12 = r12[r13]
            if (r12 != r4) goto L8a4
            if (r6 <= 0) goto L8a4
            int r12 = r27.m13721u()
            if (r12 <= r6) goto L8a4
            r1.f26206U0 = r3
            w.f$a[] r0 = r1.f26127Q
            r0[r13] = r22
            r1.m13704P(r6)
            r0 = 1
            r19 = 1
        L8a4:
            w.f$a[] r12 = r1.f26127Q
            r12 = r12[r3]
            if (r12 != r4) goto L8be
            if (r7 <= 0) goto L8be
            int r12 = r27.m13715o()
            if (r12 <= r7) goto L8be
            r1.f26207V0 = r3
            w.f$a[] r0 = r1.f26127Q
            r0[r3] = r22
            r1.m13699K(r7)
            r12 = 1
            r13 = 1
            goto L8c1
        L8be:
            r13 = r0
            r12 = r19
        L8c1:
            r0 = r15
            r3 = 64
            goto L697
        L8c6:
            r19 = r12
            r1.f26243H0 = r8
            if (r19 == 0) goto L8d4
            w.f$a[] r0 = r1.f26127Q
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r5
        L8d4:
            v.d r0 = r1.f26198M0
            v.c r0 = r0.f25093l
            r1.mo13695G(r0)
            return
    }

    /* renamed from: T */
    public void m13729T(p381w.C6765f r6, int r7) {
            r5 = this;
            r0 = 1
            if (r7 != 0) goto L28
            int r7 = r5.f26201P0
            int r7 = r7 + r0
            w.c[] r1 = r5.f26204S0
            int r2 = r1.length
            if (r7 < r2) goto L16
            int r7 = r1.length
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r7)
            w.c[] r7 = (p381w.C6762c[]) r7
            r5.f26204S0 = r7
        L16:
            w.c[] r7 = r5.f26204S0
            int r1 = r5.f26201P0
            w.c r2 = new w.c
            r3 = 0
            boolean r4 = r5.f26197L0
            r2.<init>(r6, r3, r4)
            r7[r1] = r2
            int r1 = r1 + r0
            r5.f26201P0 = r1
            goto L4d
        L28:
            if (r7 != r0) goto L4d
            int r7 = r5.f26202Q0
            int r7 = r7 + r0
            w.c[] r1 = r5.f26203R0
            int r2 = r1.length
            if (r7 < r2) goto L3d
            int r7 = r1.length
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r7)
            w.c[] r7 = (p381w.C6762c[]) r7
            r5.f26203R0 = r7
        L3d:
            w.c[] r7 = r5.f26203R0
            int r1 = r5.f26202Q0
            w.c r2 = new w.c
            boolean r3 = r5.f26197L0
            r2.<init>(r6, r0, r3)
            r7[r1] = r2
            int r1 = r1 + r0
            r5.f26202Q0 = r1
        L4d:
            return
    }

    /* renamed from: U */
    public boolean m13730U(p365v.C6477d r15) {
            r14 = this;
            w.f$a r0 = p381w.C6765f.a.f26189Y
            w.f$a r1 = p381w.C6765f.a.f26190Z
            r2 = 64
            boolean r2 = r14.m13736b0(r2)
            r14.mo13674f(r15, r2)
            java.util.ArrayList<w.f> r3 = r14.f26243H0
            int r3 = r3.size()
            r4 = 0
            r5 = 0
            r6 = 0
        L16:
            r7 = 1
            if (r5 >= r3) goto L2f
            java.util.ArrayList<w.f> r8 = r14.f26243H0
            java.lang.Object r8 = r8.get(r5)
            w.f r8 = (p381w.C6765f) r8
            boolean[] r9 = r8.f26126P
            r9[r4] = r4
            r9[r7] = r4
            boolean r8 = r8 instanceof p381w.C6760a
            if (r8 == 0) goto L2c
            r6 = 1
        L2c:
            int r5 = r5 + 1
            goto L16
        L2f:
            if (r6 == 0) goto L67
            r5 = 0
        L32:
            if (r5 >= r3) goto L67
            java.util.ArrayList<w.f> r6 = r14.f26243H0
            java.lang.Object r6 = r6.get(r5)
            w.f r6 = (p381w.C6765f) r6
            boolean r8 = r6 instanceof p381w.C6760a
            if (r8 == 0) goto L64
            w.a r6 = (p381w.C6760a) r6
            r8 = 0
        L43:
            int r9 = r6.f26240I0
            if (r8 >= r9) goto L64
            w.f[] r9 = r6.f26239H0
            r9 = r9[r8]
            int r10 = r6.f26062J0
            if (r10 == 0) goto L5d
            if (r10 != r7) goto L52
            goto L5d
        L52:
            r11 = 2
            if (r10 == r11) goto L58
            r11 = 3
            if (r10 != r11) goto L61
        L58:
            boolean[] r9 = r9.f26126P
            r9[r7] = r7
            goto L61
        L5d:
            boolean[] r9 = r9.f26126P
            r9[r4] = r7
        L61:
            int r8 = r8 + 1
            goto L43
        L64:
            int r5 = r5 + 1
            goto L32
        L67:
            r5 = 0
        L68:
            if (r5 >= r3) goto L7e
            java.util.ArrayList<w.f> r6 = r14.f26243H0
            java.lang.Object r6 = r6.get(r5)
            w.f r6 = (p381w.C6765f) r6
            boolean r8 = r6.m13708e()
            if (r8 == 0) goto L7b
            r6.mo13674f(r15, r2)
        L7b:
            int r5 = r5 + 1
            goto L68
        L7e:
            boolean r5 = p365v.C6477d.f25079p
            if (r5 == 0) goto Lc6
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5 = 0
        L88:
            if (r5 >= r3) goto L9e
            java.util.ArrayList<w.f> r6 = r14.f26243H0
            java.lang.Object r6 = r6.get(r5)
            w.f r6 = (p381w.C6765f) r6
            boolean r8 = r6.m13708e()
            if (r8 != 0) goto L9b
            r0.add(r6)
        L9b:
            int r5 = r5 + 1
            goto L88
        L9e:
            w.f$a r3 = r14.m13716p()
            if (r3 != r1) goto La6
            r12 = 0
            goto La7
        La6:
            r12 = 1
        La7:
            r13 = 0
            r8 = r14
            r9 = r14
            r10 = r15
            r11 = r0
            r8.m13707d(r9, r10, r11, r12, r13)
            java.util.Iterator r0 = r0.iterator()
        Lb3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L100
            java.lang.Object r1 = r0.next()
            w.f r1 = (p381w.C6765f) r1
            p381w.C6771l.m13745a(r14, r15, r1)
            r1.mo13674f(r15, r2)
            goto Lb3
        Lc6:
            r5 = 0
        Lc7:
            if (r5 >= r3) goto L100
            java.util.ArrayList<w.f> r6 = r14.f26243H0
            java.lang.Object r6 = r6.get(r5)
            w.f r6 = (p381w.C6765f) r6
            boolean r8 = r6 instanceof p381w.C6766g
            if (r8 == 0) goto Lf1
            w.f$a[] r8 = r6.f26127Q
            r9 = r8[r4]
            r10 = r8[r7]
            if (r9 != r1) goto Ldf
            r8[r4] = r0
        Ldf:
            if (r10 != r1) goto Le3
            r8[r7] = r0
        Le3:
            r6.mo13674f(r15, r2)
            if (r9 != r1) goto Leb
            r6.m13700L(r9)
        Leb:
            if (r10 != r1) goto Lfd
            r6.m13703O(r10)
            goto Lfd
        Lf1:
            p381w.C6771l.m13745a(r14, r15, r6)
            boolean r8 = r6.m13708e()
            if (r8 != 0) goto Lfd
            r6.mo13674f(r15, r2)
        Lfd:
            int r5 = r5 + 1
            goto Lc7
        L100:
            int r0 = r14.f26201P0
            r1 = 0
            if (r0 <= 0) goto L108
            p381w.C6761b.m13677a(r14, r15, r1, r4)
        L108:
            int r0 = r14.f26202Q0
            if (r0 <= 0) goto L10f
            p381w.C6761b.m13677a(r14, r15, r1, r7)
        L10f:
            return r7
    }

    /* renamed from: V */
    public void m13731V(p381w.C6763d r3) {
            r2 = this;
            java.lang.ref.WeakReference<w.d> r0 = r2.f26211Z0
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1c
            int r0 = r3.m13680c()
            java.lang.ref.WeakReference<w.d> r1 = r2.f26211Z0
            java.lang.Object r1 = r1.get()
            w.d r1 = (p381w.C6763d) r1
            int r1 = r1.m13680c()
            if (r0 <= r1) goto L23
        L1c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f26211Z0 = r0
        L23:
            return
    }

    /* renamed from: W */
    public void m13732W(p381w.C6763d r3) {
            r2 = this;
            java.lang.ref.WeakReference<w.d> r0 = r2.f26210Y0
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1c
            int r0 = r3.m13680c()
            java.lang.ref.WeakReference<w.d> r1 = r2.f26210Y0
            java.lang.Object r1 = r1.get()
            w.d r1 = (p381w.C6763d) r1
            int r1 = r1.m13680c()
            if (r0 <= r1) goto L23
        L1c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f26210Y0 = r0
        L23:
            return
    }

    /* renamed from: X */
    public void m13733X(p381w.C6763d r3) {
            r2 = this;
            java.lang.ref.WeakReference<w.d> r0 = r2.f26208W0
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1c
            int r0 = r3.m13680c()
            java.lang.ref.WeakReference<w.d> r1 = r2.f26208W0
            java.lang.Object r1 = r1.get()
            w.d r1 = (p381w.C6763d) r1
            int r1 = r1.m13680c()
            if (r0 <= r1) goto L23
        L1c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f26208W0 = r0
        L23:
            return
    }

    /* renamed from: Y */
    public boolean m13734Y(boolean r14, int r15) {
            r13 = this;
            x.e r0 = r13.f26195J0
            w.f$a r1 = p381w.C6765f.a.f26192b0
            w.f$a r2 = p381w.C6765f.a.f26190Z
            w.f$a r3 = p381w.C6765f.a.f26189Y
            r4 = 1
            r14 = r14 & r4
            w.g r5 = r0.f26811a
            r6 = 0
            w.f$a r5 = r5.m13714n(r6)
            w.g r7 = r0.f26811a
            w.f$a r7 = r7.m13714n(r4)
            w.g r8 = r0.f26811a
            int r8 = r8.m13722v()
            w.g r9 = r0.f26811a
            int r9 = r9.m13723w()
            if (r14 == 0) goto L82
            if (r5 == r2) goto L29
            if (r7 != r2) goto L82
        L29:
            java.util.ArrayList<x.p> r10 = r0.f26815e
            java.util.Iterator r10 = r10.iterator()
        L2f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L46
            java.lang.Object r11 = r10.next()
            x.p r11 = (p401x.AbstractC6908p) r11
            int r12 = r11.f26859f
            if (r12 != r15) goto L2f
            boolean r11 = r11.mo13969k()
            if (r11 != 0) goto L2f
            r14 = 0
        L46:
            if (r15 != 0) goto L64
            if (r14 == 0) goto L82
            if (r5 != r2) goto L82
            w.g r14 = r0.f26811a
            w.f$a[] r2 = r14.f26127Q
            r2[r6] = r3
            int r2 = r0.m13975d(r14, r6)
            r14.m13704P(r2)
            w.g r14 = r0.f26811a
            x.l r2 = r14.f26143d
            x.g r2 = r2.f26858e
            int r14 = r14.m13721u()
            goto L7f
        L64:
            if (r14 == 0) goto L82
            if (r7 != r2) goto L82
            w.g r14 = r0.f26811a
            w.f$a[] r2 = r14.f26127Q
            r2[r4] = r3
            int r2 = r0.m13975d(r14, r4)
            r14.m13699K(r2)
            w.g r14 = r0.f26811a
            x.n r2 = r14.f26145e
            x.g r2 = r2.f26858e
            int r14 = r14.m13715o()
        L7f:
            r2.mo13980c(r14)
        L82:
            w.g r14 = r0.f26811a
            w.f$a[] r2 = r14.f26127Q
            if (r15 != 0) goto La6
            r9 = r2[r6]
            if (r9 == r3) goto L90
            r2 = r2[r6]
            if (r2 != r1) goto Laf
        L90:
            int r14 = r14.m13721u()
            int r14 = r14 + r8
            w.g r1 = r0.f26811a
            x.l r1 = r1.f26143d
            x.f r1 = r1.f26862i
            r1.mo13980c(r14)
            w.g r1 = r0.f26811a
            x.l r1 = r1.f26143d
            x.g r1 = r1.f26858e
            int r14 = r14 - r8
            goto Lc6
        La6:
            r8 = r2[r4]
            if (r8 == r3) goto Lb1
            r2 = r2[r4]
            if (r2 != r1) goto Laf
            goto Lb1
        Laf:
            r14 = 0
            goto Lca
        Lb1:
            int r14 = r14.m13715o()
            int r14 = r14 + r9
            w.g r1 = r0.f26811a
            x.n r1 = r1.f26145e
            x.f r1 = r1.f26862i
            r1.mo13980c(r14)
            w.g r1 = r0.f26811a
            x.n r1 = r1.f26145e
            x.g r1 = r1.f26858e
            int r14 = r14 - r9
        Lc6:
            r1.mo13980c(r14)
            r14 = 1
        Lca:
            r0.m13978g()
            java.util.ArrayList<x.p> r1 = r0.f26815e
            java.util.Iterator r1 = r1.iterator()
        Ld3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r1.next()
            x.p r2 = (p401x.AbstractC6908p) r2
            int r3 = r2.f26859f
            if (r3 == r15) goto Le4
            goto Ld3
        Le4:
            w.f r3 = r2.f26855b
            w.g r8 = r0.f26811a
            if (r3 != r8) goto Lef
            boolean r3 = r2.f26860g
            if (r3 != 0) goto Lef
            goto Ld3
        Lef:
            r2.mo13966e()
            goto Ld3
        Lf3:
            java.util.ArrayList<x.p> r1 = r0.f26815e
            java.util.Iterator r1 = r1.iterator()
        Lf9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L12c
            java.lang.Object r2 = r1.next()
            x.p r2 = (p401x.AbstractC6908p) r2
            int r3 = r2.f26859f
            if (r3 == r15) goto L10a
            goto Lf9
        L10a:
            if (r14 != 0) goto L113
            w.f r3 = r2.f26855b
            w.g r8 = r0.f26811a
            if (r3 != r8) goto L113
            goto Lf9
        L113:
            x.f r3 = r2.f26861h
            boolean r3 = r3.f26828j
            if (r3 != 0) goto L11a
            goto L12b
        L11a:
            x.f r3 = r2.f26862i
            boolean r3 = r3.f26828j
            if (r3 != 0) goto L121
            goto L12b
        L121:
            boolean r3 = r2 instanceof p401x.C6895c
            if (r3 != 0) goto Lf9
            x.g r2 = r2.f26858e
            boolean r2 = r2.f26828j
            if (r2 != 0) goto Lf9
        L12b:
            r4 = 0
        L12c:
            w.g r14 = r0.f26811a
            r14.m13700L(r5)
            w.g r14 = r0.f26811a
            r14.m13703O(r7)
            return r4
    }

    /* renamed from: Z */
    public void m13735Z() {
            r2 = this;
            x.e r0 = r2.f26195J0
            r1 = 1
            r0.f26812b = r1
            return
    }

    /* renamed from: b0 */
    public boolean m13736b0(int r2) {
            r1 = this;
            int r0 = r1.f26205T0
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    /* renamed from: c0 */
    public void m13737c0(p401x.C6894b.b r2) {
            r1 = this;
            r1.f26196K0 = r2
            x.e r0 = r1.f26195J0
            r0.f26816f = r2
            return
    }

    /* renamed from: d0 */
    public void m13738d0(int r1) {
            r0 = this;
            r0.f26205T0 = r1
            r1 = 512(0x200, float:7.17E-43)
            boolean r1 = r0.m13736b0(r1)
            p365v.C6477d.f25079p = r1
            return
    }
}
