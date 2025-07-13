package p088f4;

/* renamed from: f4.n1 */
/* loaded from: classes.dex */
public abstract class AbstractC2031n1 implements p088f4.InterfaceC2014i {

    /* renamed from: Y */
    public static final p088f4.AbstractC2031n1 f9223Y = null;

    /* renamed from: f4.n1$a */
    public class a extends p088f4.AbstractC2031n1 {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: c */
        public int mo5086c(java.lang.Object r1) {
                r0 = this;
                r1 = -1
                return r1
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: h */
        public p088f4.AbstractC2031n1.b mo5089h(int r1, p088f4.AbstractC2031n1.b r2, boolean r3) {
                r0 = this;
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                r1.<init>()
                throw r1
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: j */
        public int mo5179j() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: n */
        public java.lang.Object mo5092n(int r1) {
                r0 = this;
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                r1.<init>()
                throw r1
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: p */
        public p088f4.AbstractC2031n1.d mo5093p(int r1, p088f4.AbstractC2031n1.d r2, long r3) {
                r0 = this;
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                r1.<init>()
                throw r1
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: q */
        public int mo5180q() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* renamed from: f4.n1$b */
    public static final class b implements p088f4.InterfaceC2014i {

        /* renamed from: f0 */
        public static final p088f4.InterfaceC2014i.a<p088f4.AbstractC2031n1.b> f9224f0 = null;

        /* renamed from: Y */
        public java.lang.Object f9225Y;

        /* renamed from: Z */
        public java.lang.Object f9226Z;

        /* renamed from: a0 */
        public int f9227a0;

        /* renamed from: b0 */
        public long f9228b0;

        /* renamed from: c0 */
        public long f9229c0;

        /* renamed from: d0 */
        public boolean f9230d0;

        /* renamed from: e0 */
        public p122h5.C2486a f9231e0;

        static {
                k1.c r0 = p179k1.C3644c.f16086h0
                p088f4.AbstractC2031n1.b.f9224f0 = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                h5.a r0 = p122h5.C2486a.f11231e0
                r1.f9231e0 = r0
                return
        }

        /* renamed from: f */
        public static java.lang.String m5345f(int r1) {
                r0 = 36
                java.lang.String r1 = java.lang.Integer.toString(r1, r0)
                return r1
        }

        /* renamed from: a */
        public long m5346a(int r3, int r4) {
                r2 = this;
                h5.a r0 = r2.f9231e0
                h5.a$a r3 = r0.m6359a(r3)
                int r0 = r3.f11242Z
                r1 = -1
                if (r0 == r1) goto L10
                long[] r3 = r3.f11245c0
                r0 = r3[r4]
                goto L15
            L10:
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L15:
                return r0
        }

        /* renamed from: b */
        public int m5347b(long r10) {
                r9 = this;
                h5.a r0 = r9.f9231e0
                long r1 = r9.f9228b0
                java.util.Objects.requireNonNull(r0)
                r3 = -9223372036854775808
                r5 = -1
                int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r6 == 0) goto L54
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r8 == 0) goto L1c
                int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r6 < 0) goto L1c
                goto L54
            L1c:
                int r1 = r0.f11238c0
            L1e:
                int r2 = r0.f11235Z
                if (r1 >= r2) goto L4f
                h5.a$a r2 = r0.m6359a(r1)
                long r6 = r2.f11241Y
                int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r2 == 0) goto L36
                h5.a$a r2 = r0.m6359a(r1)
                long r6 = r2.f11241Y
                int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r2 <= 0) goto L4c
            L36:
                h5.a$a r2 = r0.m6359a(r1)
                int r6 = r2.f11242Z
                if (r6 == r5) goto L49
                int r6 = r2.m6361a(r5)
                int r2 = r2.f11242Z
                if (r6 >= r2) goto L47
                goto L49
            L47:
                r2 = 0
                goto L4a
            L49:
                r2 = 1
            L4a:
                if (r2 != 0) goto L4f
            L4c:
                int r1 = r1 + 1
                goto L1e
            L4f:
                int r10 = r0.f11235Z
                if (r1 >= r10) goto L54
                r5 = r1
            L54:
                return r5
        }

        /* renamed from: c */
        public long m5348c(int r3) {
                r2 = this;
                h5.a r0 = r2.f9231e0
                h5.a$a r3 = r0.m6359a(r3)
                long r0 = r3.f11241Y
                return r0
        }

        /* renamed from: d */
        public int m5349d(int r2) {
                r1 = this;
                h5.a r0 = r1.f9231e0
                h5.a$a r2 = r0.m6359a(r2)
                r0 = -1
                int r2 = r2.m6361a(r0)
                return r2
        }

        /* renamed from: e */
        public boolean m5350e(int r2) {
                r1 = this;
                h5.a r0 = r1.f9231e0
                h5.a$a r2 = r0.m6359a(r2)
                boolean r2 = r2.f11247e0
                return r2
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L53
                java.lang.Class<f4.n1$b> r2 = p088f4.AbstractC2031n1.b.class
                java.lang.Class r3 = r8.getClass()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L14
                goto L53
            L14:
                f4.n1$b r8 = (p088f4.AbstractC2031n1.b) r8
                java.lang.Object r2 = r7.f9225Y
                java.lang.Object r3 = r8.f9225Y
                boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
                if (r2 == 0) goto L51
                java.lang.Object r2 = r7.f9226Z
                java.lang.Object r3 = r8.f9226Z
                boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
                if (r2 == 0) goto L51
                int r2 = r7.f9227a0
                int r3 = r8.f9227a0
                if (r2 != r3) goto L51
                long r2 = r7.f9228b0
                long r4 = r8.f9228b0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L51
                long r2 = r7.f9229c0
                long r4 = r8.f9229c0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L51
                boolean r2 = r7.f9230d0
                boolean r3 = r8.f9230d0
                if (r2 != r3) goto L51
                h5.a r2 = r7.f9231e0
                h5.a r8 = r8.f9231e0
                boolean r8 = p371v5.C6552b0.m13308a(r2, r8)
                if (r8 == 0) goto L51
                goto L52
            L51:
                r0 = 0
            L52:
                return r0
            L53:
                return r1
        }

        /* renamed from: g */
        public p088f4.AbstractC2031n1.b m5351g(java.lang.Object r1, java.lang.Object r2, int r3, long r4, long r6, p122h5.C2486a r8, boolean r9) {
                r0 = this;
                r0.f9225Y = r1
                r0.f9226Z = r2
                r0.f9227a0 = r3
                r0.f9228b0 = r4
                r0.f9229c0 = r6
                r0.f9231e0 = r8
                r0.f9230d0 = r9
                return r0
        }

        public int hashCode() {
                r6 = this;
                java.lang.Object r0 = r6.f9225Y
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                r2 = 217(0xd9, float:3.04E-43)
                int r2 = r2 + r0
                int r2 = r2 * 31
                java.lang.Object r0 = r6.f9226Z
                if (r0 != 0) goto L15
                goto L19
            L15:
                int r1 = r0.hashCode()
            L19:
                int r2 = r2 + r1
                int r2 = r2 * 31
                int r0 = r6.f9227a0
                int r2 = r2 + r0
                int r2 = r2 * 31
                long r0 = r6.f9228b0
                r3 = 32
                long r4 = r0 >>> r3
                long r0 = r0 ^ r4
                int r1 = (int) r0
                int r2 = r2 + r1
                int r2 = r2 * 31
                long r0 = r6.f9229c0
                long r3 = r0 >>> r3
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r2 = r2 + r1
                int r2 = r2 * 31
                boolean r0 = r6.f9230d0
                int r2 = r2 + r0
                int r2 = r2 * 31
                h5.a r0 = r6.f9231e0
                int r0 = r0.hashCode()
                int r0 = r0 + r2
                return r0
        }
    }

    /* renamed from: f4.n1$c */
    public static final class c extends p088f4.AbstractC2031n1 {

        /* renamed from: Z */
        public final p026b9.AbstractC0714n<p088f4.AbstractC2031n1.d> f9232Z;

        /* renamed from: a0 */
        public final p026b9.AbstractC0714n<p088f4.AbstractC2031n1.b> f9233a0;

        /* renamed from: b0 */
        public final int[] f9234b0;

        /* renamed from: c0 */
        public final int[] f9235c0;

        public c(p026b9.AbstractC0714n<p088f4.AbstractC2031n1.d> r4, p026b9.AbstractC0714n<p088f4.AbstractC2031n1.b> r5, int[] r6) {
                r3 = this;
                r3.<init>()
                r0 = r4
                b9.c0 r0 = (p026b9.C0693c0) r0
                int r0 = r0.f3900b0
                int r1 = r6.length
                r2 = 0
                if (r0 != r1) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                p371v5.C6549a.m13288b(r0)
                r3.f9232Z = r4
                r3.f9233a0 = r5
                r3.f9234b0 = r6
                int r4 = r6.length
                int[] r4 = new int[r4]
                r3.f9235c0 = r4
            L1d:
                int r4 = r6.length
                if (r2 >= r4) goto L29
                int[] r4 = r3.f9235c0
                r5 = r6[r2]
                r4[r5] = r2
                int r2 = r2 + 1
                goto L1d
            L29:
                return
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: b */
        public int mo5085b(boolean r2) {
                r1 = this;
                boolean r0 = r1.m5344r()
                if (r0 == 0) goto L8
                r2 = -1
                return r2
            L8:
                r0 = 0
                if (r2 == 0) goto Lf
                int[] r2 = r1.f9234b0
                r0 = r2[r0]
            Lf:
                return r0
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: c */
        public int mo5086c(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: d */
        public int mo5087d(boolean r2) {
                r1 = this;
                boolean r0 = r1.m5344r()
                if (r0 == 0) goto L8
                r2 = -1
                return r2
            L8:
                if (r2 == 0) goto L15
                int[] r2 = r1.f9234b0
                int r0 = r1.mo5180q()
                int r0 = r0 + (-1)
                r2 = r2[r0]
                goto L1b
            L15:
                int r2 = r1.mo5180q()
                int r2 = r2 + (-1)
            L1b:
                return r2
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: f */
        public int mo5088f(int r3, int r4, boolean r5) {
                r2 = this;
                r0 = 1
                if (r4 != r0) goto L4
                return r3
            L4:
                int r1 = r2.mo5087d(r5)
                if (r3 != r1) goto L14
                r3 = 2
                if (r4 != r3) goto L12
                int r3 = r2.mo5085b(r5)
                goto L13
            L12:
                r3 = -1
            L13:
                return r3
            L14:
                if (r5 == 0) goto L20
                int[] r4 = r2.f9234b0
                int[] r5 = r2.f9235c0
                r3 = r5[r3]
                int r3 = r3 + r0
                r3 = r4[r3]
                goto L21
            L20:
                int r3 = r3 + r0
            L21:
                return r3
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: h */
        public p088f4.AbstractC2031n1.b mo5089h(int r11, p088f4.AbstractC2031n1.b r12, boolean r13) {
                r10 = this;
                b9.n<f4.n1$b> r13 = r10.f9233a0
                java.lang.Object r11 = r13.get(r11)
                f4.n1$b r11 = (p088f4.AbstractC2031n1.b) r11
                java.lang.Object r1 = r11.f9225Y
                java.lang.Object r2 = r11.f9226Z
                int r3 = r11.f9227a0
                long r4 = r11.f9228b0
                long r6 = r11.f9229c0
                h5.a r8 = r11.f9231e0
                boolean r9 = r11.f9230d0
                r0 = r12
                r0.m5351g(r1, r2, r3, r4, r6, r8, r9)
                return r12
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: j */
        public int mo5179j() {
                r1 = this;
                b9.n<f4.n1$b> r0 = r1.f9233a0
                int r0 = r0.size()
                return r0
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: m */
        public int mo5091m(int r3, int r4, boolean r5) {
                r2 = this;
                r0 = 1
                if (r4 != r0) goto L4
                return r3
            L4:
                int r1 = r2.mo5085b(r5)
                if (r3 != r1) goto L14
                r3 = 2
                if (r4 != r3) goto L12
                int r3 = r2.mo5087d(r5)
                goto L13
            L12:
                r3 = -1
            L13:
                return r3
            L14:
                if (r5 == 0) goto L20
                int[] r4 = r2.f9234b0
                int[] r5 = r2.f9235c0
                r3 = r5[r3]
                int r3 = r3 - r0
                r3 = r4[r3]
                goto L21
            L20:
                int r3 = r3 - r0
            L21:
                return r3
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: n */
        public java.lang.Object mo5092n(int r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: p */
        public p088f4.AbstractC2031n1.d mo5093p(int r23, p088f4.AbstractC2031n1.d r24, long r25) {
                r22 = this;
                r15 = r24
                r0 = r24
                r13 = r22
                b9.n<f4.n1$d> r1 = r13.f9232Z
                r2 = r23
                java.lang.Object r1 = r1.get(r2)
                r14 = r1
                f4.n1$d r14 = (p088f4.AbstractC2031n1.d) r14
                java.lang.Object r1 = r14.f9240Y
                f4.j0 r2 = r14.f9242a0
                java.lang.Object r3 = r14.f9243b0
                long r4 = r14.f9244c0
                long r6 = r14.f9245d0
                long r8 = r14.f9246e0
                boolean r10 = r14.f9247f0
                boolean r11 = r14.f9248g0
                f4.j0$g r12 = r14.f9250i0
                r25 = r0
                r23 = r1
                long r0 = r14.f9252k0
                r26 = r2
                r2 = r14
                r13 = r0
                long r0 = r2.f9253l0
                r15 = r0
                int r0 = r2.f9254m0
                r17 = r0
                int r0 = r2.f9255n0
                r18 = r0
                long r0 = r2.f9256o0
                r19 = r0
                r1 = r23
                r0 = r25
                r21 = r2
                r2 = r26
                r0.m5356e(r1, r2, r3, r4, r6, r8, r10, r11, r12, r13, r15, r17, r18, r19)
                r1 = r21
                boolean r0 = r1.f9251j0
                r1 = r24
                r1.f9251j0 = r0
                return r1
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: q */
        public int mo5180q() {
                r1 = this;
                b9.n<f4.n1$d> r0 = r1.f9232Z
                int r0 = r0.size()
                return r0
        }
    }

    /* renamed from: f4.n1$d */
    public static final class d implements p088f4.InterfaceC2014i {

        /* renamed from: p0 */
        public static final java.lang.Object f9236p0 = null;

        /* renamed from: q0 */
        public static final java.lang.Object f9237q0 = null;

        /* renamed from: r0 */
        public static final p088f4.C2018j0 f9238r0 = null;

        /* renamed from: s0 */
        public static final p088f4.InterfaceC2014i.a<p088f4.AbstractC2031n1.d> f9239s0 = null;

        /* renamed from: Y */
        public java.lang.Object f9240Y;

        /* renamed from: Z */
        @java.lang.Deprecated
        public java.lang.Object f9241Z;

        /* renamed from: a0 */
        public p088f4.C2018j0 f9242a0;

        /* renamed from: b0 */
        public java.lang.Object f9243b0;

        /* renamed from: c0 */
        public long f9244c0;

        /* renamed from: d0 */
        public long f9245d0;

        /* renamed from: e0 */
        public long f9246e0;

        /* renamed from: f0 */
        public boolean f9247f0;

        /* renamed from: g0 */
        public boolean f9248g0;

        /* renamed from: h0 */
        @java.lang.Deprecated
        public boolean f9249h0;

        /* renamed from: i0 */
        public p088f4.C2018j0.g f9250i0;

        /* renamed from: j0 */
        public boolean f9251j0;

        /* renamed from: k0 */
        public long f9252k0;

        /* renamed from: l0 */
        public long f9253l0;

        /* renamed from: m0 */
        public int f9254m0;

        /* renamed from: n0 */
        public int f9255n0;

        /* renamed from: o0 */
        public long f9256o0;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                p088f4.AbstractC2031n1.d.f9236p0 = r0
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                p088f4.AbstractC2031n1.d.f9237q0 = r0
                f4.j0$d$a r0 = new f4.j0$d$a
                r0.<init>()
                f4.j0$f$a r1 = new f4.j0$f$a
                r2 = 0
                r1.<init>(r2)
                java.util.List r8 = java.util.Collections.emptyList()
                b9.n<java.lang.Object> r10 = p026b9.C0693c0.f3898c0
                f4.j0$g$a r13 = new f4.j0$g$a
                r13.<init>()
                android.net.Uri r4 = android.net.Uri.EMPTY
                android.net.Uri r3 = r1.f9007b
                if (r3 == 0) goto L31
                java.util.UUID r3 = r1.f9006a
                if (r3 == 0) goto L2f
                goto L31
            L2f:
                r3 = 0
                goto L32
            L31:
                r3 = 1
            L32:
                p371v5.C6549a.m13291e(r3)
                if (r4 == 0) goto L51
                f4.j0$i r14 = new f4.j0$i
                java.util.UUID r3 = r1.f9006a
                if (r3 == 0) goto L44
                f4.j0$f r3 = new f4.j0$f
                r3.<init>(r1, r2)
                r6 = r3
                goto L45
            L44:
                r6 = r2
            L45:
                r7 = 0
                r12 = 0
                r5 = 0
                r9 = 0
                r11 = 0
                r3 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r18 = r14
                goto L53
            L51:
                r18 = r2
            L53:
                f4.j0 r1 = new f4.j0
                f4.j0$e r17 = r0.m5265a()
                f4.j0$g r0 = new f4.j0$g
                r0.<init>(r13, r2)
                f4.k0 r20 = p088f4.C2021k0.f9094F0
                r21 = 0
                java.lang.String r16 = "com.google.android.exoplayer2.Timeline"
                r15 = r1
                r19 = r0
                r15.<init>(r16, r17, r18, r19, r20, r21)
                p088f4.AbstractC2031n1.d.f9238r0 = r1
                k1.b r0 = p179k1.C3642b.f16058g0
                p088f4.AbstractC2031n1.d.f9239s0 = r0
                return
        }

        public d() {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = p088f4.AbstractC2031n1.d.f9236p0
                r1.f9240Y = r0
                f4.j0 r0 = p088f4.AbstractC2031n1.d.f9238r0
                r1.f9242a0 = r0
                return
        }

        /* renamed from: d */
        public static java.lang.String m5352d(int r1) {
                r0 = 36
                java.lang.String r1 = java.lang.Integer.toString(r1, r0)
                return r1
        }

        /* renamed from: a */
        public long m5353a() {
                r2 = this;
                long r0 = r2.f9252k0
                long r0 = p371v5.C6552b0.m13307K(r0)
                return r0
        }

        /* renamed from: b */
        public long m5354b() {
                r2 = this;
                long r0 = r2.f9253l0
                long r0 = p371v5.C6552b0.m13307K(r0)
                return r0
        }

        /* renamed from: c */
        public boolean m5355c() {
                r4 = this;
                boolean r0 = r4.f9249h0
                f4.j0$g r1 = r4.f9250i0
                r2 = 1
                r3 = 0
                if (r1 == 0) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                if (r0 != r1) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                p371v5.C6549a.m13291e(r0)
                f4.j0$g r0 = r4.f9250i0
                if (r0 == 0) goto L18
                goto L19
            L18:
                r2 = 0
            L19:
                return r2
        }

        /* renamed from: e */
        public p088f4.AbstractC2031n1.d m5356e(java.lang.Object r6, p088f4.C2018j0 r7, java.lang.Object r8, long r9, long r11, long r13, boolean r15, boolean r16, p088f4.C2018j0.g r17, long r18, long r20, int r22, int r23, long r24) {
                r5 = this;
                r0 = r5
                r1 = r7
                r2 = r17
                r3 = r6
                r0.f9240Y = r3
                if (r1 == 0) goto Lb
                r3 = r1
                goto Ld
            Lb:
                f4.j0 r3 = p088f4.AbstractC2031n1.d.f9238r0
            Ld:
                r0.f9242a0 = r3
                if (r1 == 0) goto L18
                f4.j0$h r1 = r1.f8971Z
                if (r1 == 0) goto L18
                java.lang.Object r1 = r1.f9032g
                goto L19
            L18:
                r1 = 0
            L19:
                r0.f9241Z = r1
                r1 = r8
                r0.f9243b0 = r1
                r3 = r9
                r0.f9244c0 = r3
                r3 = r11
                r0.f9245d0 = r3
                r3 = r13
                r0.f9246e0 = r3
                r1 = r15
                r0.f9247f0 = r1
                r1 = r16
                r0.f9248g0 = r1
                r1 = 0
                if (r2 == 0) goto L33
                r3 = 1
                goto L34
            L33:
                r3 = 0
            L34:
                r0.f9249h0 = r3
                r0.f9250i0 = r2
                r2 = r18
                r0.f9252k0 = r2
                r2 = r20
                r0.f9253l0 = r2
                r2 = r22
                r0.f9254m0 = r2
                r2 = r23
                r0.f9255n0 = r2
                r2 = r24
                r0.f9256o0 = r2
                r0.f9251j0 = r1
                return r0
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L90
                java.lang.Class<f4.n1$d> r2 = p088f4.AbstractC2031n1.d.class
                java.lang.Class r3 = r8.getClass()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L15
                goto L90
            L15:
                f4.n1$d r8 = (p088f4.AbstractC2031n1.d) r8
                java.lang.Object r2 = r7.f9240Y
                java.lang.Object r3 = r8.f9240Y
                boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
                if (r2 == 0) goto L8e
                f4.j0 r2 = r7.f9242a0
                f4.j0 r3 = r8.f9242a0
                boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
                if (r2 == 0) goto L8e
                java.lang.Object r2 = r7.f9243b0
                java.lang.Object r3 = r8.f9243b0
                boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
                if (r2 == 0) goto L8e
                f4.j0$g r2 = r7.f9250i0
                f4.j0$g r3 = r8.f9250i0
                boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
                if (r2 == 0) goto L8e
                long r2 = r7.f9244c0
                long r4 = r8.f9244c0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L8e
                long r2 = r7.f9245d0
                long r4 = r8.f9245d0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L8e
                long r2 = r7.f9246e0
                long r4 = r8.f9246e0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L8e
                boolean r2 = r7.f9247f0
                boolean r3 = r8.f9247f0
                if (r2 != r3) goto L8e
                boolean r2 = r7.f9248g0
                boolean r3 = r8.f9248g0
                if (r2 != r3) goto L8e
                boolean r2 = r7.f9251j0
                boolean r3 = r8.f9251j0
                if (r2 != r3) goto L8e
                long r2 = r7.f9252k0
                long r4 = r8.f9252k0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L8e
                long r2 = r7.f9253l0
                long r4 = r8.f9253l0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L8e
                int r2 = r7.f9254m0
                int r3 = r8.f9254m0
                if (r2 != r3) goto L8e
                int r2 = r7.f9255n0
                int r3 = r8.f9255n0
                if (r2 != r3) goto L8e
                long r2 = r7.f9256o0
                long r4 = r8.f9256o0
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 != 0) goto L8e
                goto L8f
            L8e:
                r0 = 0
            L8f:
                return r0
            L90:
                return r1
        }

        public int hashCode() {
                r6 = this;
                java.lang.Object r0 = r6.f9240Y
                int r0 = r0.hashCode()
                int r0 = r0 + 217
                int r0 = r0 * 31
                f4.j0 r1 = r6.f9242a0
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.Object r0 = r6.f9243b0
                r2 = 0
                if (r0 != 0) goto L1a
                r0 = 0
                goto L1e
            L1a:
                int r0 = r0.hashCode()
            L1e:
                int r1 = r1 + r0
                int r1 = r1 * 31
                f4.j0$g r0 = r6.f9250i0
                if (r0 != 0) goto L26
                goto L2a
            L26:
                int r2 = r0.hashCode()
            L2a:
                int r1 = r1 + r2
                int r1 = r1 * 31
                long r2 = r6.f9244c0
                r0 = 32
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r1 = r1 + r3
                int r1 = r1 * 31
                long r2 = r6.f9245d0
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r1 = r1 + r3
                int r1 = r1 * 31
                long r2 = r6.f9246e0
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r1 = r1 + r3
                int r1 = r1 * 31
                boolean r2 = r6.f9247f0
                int r1 = r1 + r2
                int r1 = r1 * 31
                boolean r2 = r6.f9248g0
                int r1 = r1 + r2
                int r1 = r1 * 31
                boolean r2 = r6.f9251j0
                int r1 = r1 + r2
                int r1 = r1 * 31
                long r2 = r6.f9252k0
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r1 = r1 + r3
                int r1 = r1 * 31
                long r2 = r6.f9253l0
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r1 = r1 + r3
                int r1 = r1 * 31
                int r2 = r6.f9254m0
                int r1 = r1 + r2
                int r1 = r1 * 31
                int r2 = r6.f9255n0
                int r1 = r1 + r2
                int r1 = r1 * 31
                long r2 = r6.f9256o0
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }
    }

    static {
            f4.n1$a r0 = new f4.n1$a
            r0.<init>()
            p088f4.AbstractC2031n1.f9223Y = r0
            return
    }

    public AbstractC2031n1() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <T extends p088f4.InterfaceC2014i> p026b9.AbstractC0714n<T> m5337a(p088f4.InterfaceC2014i.a<T> r11, android.os.IBinder r12) {
            if (r12 != 0) goto L7
            b9.a<java.lang.Object> r11 = p026b9.AbstractC0714n.f3979Z
            b9.n<java.lang.Object> r11 = p026b9.C0693c0.f3898c0
            return r11
        L7:
            r0 = 4
            java.lang.String r1 = "initialCapacity"
            p026b9.C0720t.m2328b(r0, r1)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            int r3 = p088f4.BinderC2011h.f8960a
            b9.a<java.lang.Object> r3 = p026b9.AbstractC0714n.f3979Z
            p026b9.C0720t.m2328b(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r3 = 1
            r4 = 1
            r5 = 0
            r6 = 0
        L1d:
            if (r4 == 0) goto L65
            android.os.Parcel r4 = android.os.Parcel.obtain()
            android.os.Parcel r7 = android.os.Parcel.obtain()
            r4.writeInt(r6)     // Catch: java.lang.Throwable -> L5d
            r12.transact(r3, r4, r7, r1)     // Catch: android.os.RemoteException -> L56 java.lang.Throwable -> L5d
        L2d:
            int r8 = r7.readInt()     // Catch: java.lang.Throwable -> L5d
            if (r8 != r3) goto L4e
            android.os.Bundle r8 = r7.readBundle()     // Catch: java.lang.Throwable -> L5d
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.Throwable -> L5d
            int r9 = r5 + 1
            int r10 = r0.length     // Catch: java.lang.Throwable -> L5d
            if (r10 >= r9) goto L48
            int r10 = r0.length     // Catch: java.lang.Throwable -> L5d
            int r10 = p026b9.AbstractC0710l.b.m2305a(r10, r9)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)     // Catch: java.lang.Throwable -> L5d
        L48:
            r0[r5] = r8     // Catch: java.lang.Throwable -> L5d
            int r6 = r6 + 1
            r5 = r9
            goto L2d
        L4e:
            r7.recycle()
            r4.recycle()
            r4 = r8
            goto L1d
        L56:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L5d
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L5d
            throw r12     // Catch: java.lang.Throwable -> L5d
        L5d:
            r11 = move-exception
            r7.recycle()
            r4.recycle()
            throw r11
        L65:
            b9.n r12 = p026b9.AbstractC0714n.m2309q(r0, r5)
            r0 = 0
        L6a:
            r3 = r12
            b9.c0 r3 = (p026b9.C0693c0) r3
            int r4 = r3.f3900b0
            if (r1 >= r4) goto L92
            java.lang.Object r3 = r3.get(r1)
            android.os.Bundle r3 = (android.os.Bundle) r3
            f4.i r3 = r11.mo2149h(r3)
            java.util.Objects.requireNonNull(r3)
            int r4 = r0 + 1
            int r5 = r2.length
            if (r5 >= r4) goto L8c
            int r5 = r2.length
            int r5 = p026b9.AbstractC0710l.b.m2305a(r5, r4)
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
        L8c:
            r2[r0] = r3
            int r1 = r1 + 1
            r0 = r4
            goto L6a
        L92:
            b9.n r11 = p026b9.AbstractC0714n.m2309q(r2, r0)
            return r11
    }

    /* renamed from: s */
    public static java.lang.String m5338s(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }

    /* renamed from: b */
    public int mo5085b(boolean r1) {
            r0 = this;
            boolean r1 = r0.m5344r()
            if (r1 == 0) goto L8
            r1 = -1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* renamed from: c */
    public abstract int mo5086c(java.lang.Object r1);

    /* renamed from: d */
    public int mo5087d(boolean r1) {
            r0 = this;
            boolean r1 = r0.m5344r()
            if (r1 == 0) goto L8
            r1 = -1
            goto Le
        L8:
            int r1 = r0.mo5180q()
            int r1 = r1 + (-1)
        Le:
            return r1
    }

    /* renamed from: e */
    public final int m5339e(int r2, p088f4.AbstractC2031n1.b r3, p088f4.AbstractC2031n1.d r4, int r5, boolean r6) {
            r1 = this;
            r0 = 0
            f4.n1$b r3 = r1.mo5089h(r2, r3, r0)
            int r3 = r3.f9227a0
            f4.n1$d r0 = r1.m5343o(r3, r4)
            int r0 = r0.f9255n0
            if (r0 != r2) goto L1e
            int r2 = r1.mo5088f(r3, r5, r6)
            r3 = -1
            if (r2 != r3) goto L17
            return r3
        L17:
            f4.n1$d r2 = r1.m5343o(r2, r4)
            int r2 = r2.f9254m0
            return r2
        L1e:
            int r2 = r2 + 1
            return r2
    }

    public boolean equals(java.lang.Object r10) {
            r9 = this;
            r0 = 1
            if (r9 != r10) goto L4
            return r0
        L4:
            boolean r1 = r10 instanceof p088f4.AbstractC2031n1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            f4.n1 r10 = (p088f4.AbstractC2031n1) r10
            int r1 = r10.mo5180q()
            int r3 = r9.mo5180q()
            if (r1 != r3) goto L68
            int r1 = r10.mo5179j()
            int r3 = r9.mo5179j()
            if (r1 == r3) goto L21
            goto L68
        L21:
            f4.n1$d r1 = new f4.n1$d
            r1.<init>()
            f4.n1$b r3 = new f4.n1$b
            r3.<init>()
            f4.n1$d r4 = new f4.n1$d
            r4.<init>()
            f4.n1$b r5 = new f4.n1$b
            r5.<init>()
            r6 = 0
        L36:
            int r7 = r9.mo5180q()
            if (r6 >= r7) goto L4e
            f4.n1$d r7 = r9.m5343o(r6, r1)
            f4.n1$d r8 = r10.m5343o(r6, r4)
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L4b
            return r2
        L4b:
            int r6 = r6 + 1
            goto L36
        L4e:
            r1 = 0
        L4f:
            int r4 = r9.mo5179j()
            if (r1 >= r4) goto L67
            f4.n1$b r4 = r9.mo5089h(r1, r3, r0)
            f4.n1$b r6 = r10.mo5089h(r1, r5, r0)
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L64
            return r2
        L64:
            int r1 = r1 + 1
            goto L4f
        L67:
            return r0
        L68:
            return r2
    }

    /* renamed from: f */
    public int mo5088f(int r3, int r4, boolean r5) {
            r2 = this;
            r0 = 1
            if (r4 == 0) goto L1c
            if (r4 == r0) goto L1b
            r1 = 2
            if (r4 != r1) goto L15
            int r4 = r2.mo5087d(r5)
            if (r3 != r4) goto L13
            int r3 = r2.mo5085b(r5)
            goto L14
        L13:
            int r3 = r3 + r0
        L14:
            return r3
        L15:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L1b:
            return r3
        L1c:
            int r4 = r2.mo5087d(r5)
            if (r3 != r4) goto L24
            r3 = -1
            goto L25
        L24:
            int r3 = r3 + r0
        L25:
            return r3
    }

    /* renamed from: g */
    public final p088f4.AbstractC2031n1.b m5340g(int r2, p088f4.AbstractC2031n1.b r3) {
            r1 = this;
            r0 = 0
            f4.n1$b r2 = r1.mo5089h(r2, r3, r0)
            return r2
    }

    /* renamed from: h */
    public abstract p088f4.AbstractC2031n1.b mo5089h(int r1, p088f4.AbstractC2031n1.b r2, boolean r3);

    public int hashCode() {
            r6 = this;
            f4.n1$d r0 = new f4.n1$d
            r0.<init>()
            f4.n1$b r1 = new f4.n1$b
            r1.<init>()
            int r2 = r6.mo5180q()
            int r2 = r2 + 217
            r3 = 0
            r4 = 0
        L12:
            int r5 = r6.mo5180q()
            int r2 = r2 * 31
            if (r4 >= r5) goto L26
            f4.n1$d r5 = r6.m5343o(r4, r0)
            int r5 = r5.hashCode()
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L12
        L26:
            int r0 = r6.mo5179j()
            int r0 = r0 + r2
        L2b:
            int r2 = r6.mo5179j()
            if (r3 >= r2) goto L40
            int r0 = r0 * 31
            r2 = 1
            f4.n1$b r2 = r6.mo5089h(r3, r1, r2)
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r3 = r3 + 1
            goto L2b
        L40:
            return r0
    }

    /* renamed from: i */
    public p088f4.AbstractC2031n1.b mo5090i(java.lang.Object r2, p088f4.AbstractC2031n1.b r3) {
            r1 = this;
            int r2 = r1.mo5086c(r2)
            r0 = 1
            f4.n1$b r2 = r1.mo5089h(r2, r3, r0)
            return r2
    }

    /* renamed from: j */
    public abstract int mo5179j();

    @com.google.errorprone.annotations.InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @java.lang.Deprecated
    /* renamed from: k */
    public final android.util.Pair<java.lang.Object, java.lang.Long> m5341k(p088f4.AbstractC2031n1.d r9, p088f4.AbstractC2031n1.b r10, int r11, long r12) {
            r8 = this;
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            android.util.Pair r9 = r0.m5342l(r1, r2, r3, r4, r6)
            java.util.Objects.requireNonNull(r9)
            return r9
    }

    @com.google.errorprone.annotations.InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @java.lang.Deprecated
    /* renamed from: l */
    public final android.util.Pair<java.lang.Object, java.lang.Long> m5342l(p088f4.AbstractC2031n1.d r5, p088f4.AbstractC2031n1.b r6, int r7, long r8, long r10) {
            r4 = this;
            int r0 = r4.mo5180q()
            r1 = 0
            p371v5.C6549a.m13290d(r7, r1, r0)
            r4.mo5093p(r7, r5, r10)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 != 0) goto L1c
            long r8 = r5.f9252k0
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 != 0) goto L1c
            r5 = 0
            goto L60
        L1c:
            int r7 = r5.f9254m0
            r4.m5340g(r7, r6)
        L21:
            int r0 = r5.f9255n0
            if (r7 >= r0) goto L39
            long r0 = r6.f9229c0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L39
            int r0 = r7 + 1
            f4.n1$b r1 = r4.m5340g(r0, r6)
            long r1 = r1.f9229c0
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 > 0) goto L39
            r7 = r0
            goto L21
        L39:
            r5 = 1
            r4.mo5089h(r7, r6, r5)
            long r0 = r6.f9229c0
            long r8 = r8 - r0
            long r0 = r6.f9228b0
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 == 0) goto L4d
            r10 = 1
            long r0 = r0 - r10
            long r8 = java.lang.Math.min(r8, r0)
        L4d:
            r10 = 0
            long r7 = java.lang.Math.max(r10, r8)
            java.lang.Object r5 = r6.f9226Z
            java.util.Objects.requireNonNull(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            android.util.Pair r5 = android.util.Pair.create(r5, r6)
        L60:
            return r5
    }

    /* renamed from: m */
    public int mo5091m(int r3, int r4, boolean r5) {
            r2 = this;
            r0 = 1
            if (r4 == 0) goto L1c
            if (r4 == r0) goto L1b
            r1 = 2
            if (r4 != r1) goto L15
            int r4 = r2.mo5085b(r5)
            if (r3 != r4) goto L13
            int r3 = r2.mo5087d(r5)
            goto L14
        L13:
            int r3 = r3 - r0
        L14:
            return r3
        L15:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L1b:
            return r3
        L1c:
            int r4 = r2.mo5085b(r5)
            if (r3 != r4) goto L24
            r3 = -1
            goto L25
        L24:
            int r3 = r3 - r0
        L25:
            return r3
    }

    /* renamed from: n */
    public abstract java.lang.Object mo5092n(int r1);

    /* renamed from: o */
    public final p088f4.AbstractC2031n1.d m5343o(int r3, p088f4.AbstractC2031n1.d r4) {
            r2 = this;
            r0 = 0
            f4.n1$d r3 = r2.mo5093p(r3, r4, r0)
            return r3
    }

    /* renamed from: p */
    public abstract p088f4.AbstractC2031n1.d mo5093p(int r1, p088f4.AbstractC2031n1.d r2, long r3);

    /* renamed from: q */
    public abstract int mo5180q();

    /* renamed from: r */
    public final boolean m5344r() {
            r1 = this;
            int r0 = r1.mo5180q()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
