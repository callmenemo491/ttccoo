package p325s5;

/* renamed from: s5.d */
/* loaded from: classes.dex */
public class C5964d extends p325s5.AbstractC5968h {

    /* renamed from: d */
    public static final int[] f22933d = null;

    /* renamed from: e */
    public static final p026b9.AbstractC0691b0<java.lang.Integer> f22934e = null;

    /* renamed from: f */
    public static final p026b9.AbstractC0691b0<java.lang.Integer> f22935f = null;

    /* renamed from: b */
    public final p325s5.InterfaceC5966f.b f22936b;

    /* renamed from: c */
    public final java.util.concurrent.atomic.AtomicReference<p325s5.C5964d.d> f22937c;

    /* renamed from: s5.d$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: s5.d$b */
    public static final class b implements java.lang.Comparable<p325s5.C5964d.b> {

        /* renamed from: Y */
        public final boolean f22938Y;

        /* renamed from: Z */
        public final java.lang.String f22939Z;

        /* renamed from: a0 */
        public final p325s5.C5964d.d f22940a0;

        /* renamed from: b0 */
        public final boolean f22941b0;

        /* renamed from: c0 */
        public final int f22942c0;

        /* renamed from: d0 */
        public final int f22943d0;

        /* renamed from: e0 */
        public final int f22944e0;

        /* renamed from: f0 */
        public final int f22945f0;

        /* renamed from: g0 */
        public final int f22946g0;

        /* renamed from: h0 */
        public final boolean f22947h0;

        /* renamed from: i0 */
        public final int f22948i0;

        /* renamed from: j0 */
        public final int f22949j0;

        /* renamed from: k0 */
        public final int f22950k0;

        /* renamed from: l0 */
        public final int f22951l0;

        public b(p088f4.C2003e0 r7, p325s5.C5964d.d r8, int r9) {
                r6 = this;
                r6.<init>()
                r6.f22940a0 = r8
                java.lang.String r0 = r7.f8887a0
                java.lang.String r0 = p325s5.C5964d.m12419i(r0)
                r6.f22939Z = r0
                r0 = 0
                boolean r9 = p325s5.C5964d.m12417f(r9, r0)
                r6.f22941b0 = r9
                r9 = 0
            L15:
                b9.n<java.lang.String> r1 = r8.f23031k0
                int r1 = r1.size()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r9 >= r1) goto L32
                b9.n<java.lang.String> r1 = r8.f23031k0
                java.lang.Object r1 = r1.get(r9)
                java.lang.String r1 = (java.lang.String) r1
                int r1 = p325s5.C5964d.m12415d(r7, r1, r0)
                if (r1 <= 0) goto L2f
                goto L36
            L2f:
                int r9 = r9 + 1
                goto L15
            L32:
                r9 = 2147483647(0x7fffffff, float:NaN)
                r1 = 0
            L36:
                r6.f22943d0 = r9
                r6.f22942c0 = r1
                int r9 = r7.f8889c0
                int r1 = r8.f23032l0
                r9 = r9 & r1
                int r9 = java.lang.Integer.bitCount(r9)
                r6.f22944e0 = r9
                int r9 = r7.f8888b0
                r1 = 1
                r9 = r9 & r1
                if (r9 == 0) goto L4d
                r9 = 1
                goto L4e
            L4d:
                r9 = 0
            L4e:
                r6.f22947h0 = r9
                int r9 = r7.f8909w0
                r6.f22948i0 = r9
                int r3 = r7.f8910x0
                r6.f22949j0 = r3
                int r3 = r7.f8892f0
                r6.f22950k0 = r3
                r4 = -1
                if (r3 == r4) goto L63
                int r5 = r8.f23034n0
                if (r3 > r5) goto L6a
            L63:
                if (r9 == r4) goto L6c
                int r3 = r8.f23033m0
                if (r9 > r3) goto L6a
                goto L6c
            L6a:
                r9 = 0
                goto L6d
            L6c:
                r9 = 1
            L6d:
                r6.f22938Y = r9
                int r9 = p371v5.C6552b0.f25624a
                android.content.res.Resources r9 = android.content.res.Resources.getSystem()
                android.content.res.Configuration r9 = r9.getConfiguration()
                int r3 = p371v5.C6552b0.f25624a
                r4 = 24
                if (r3 < r4) goto L8e
                android.os.LocaleList r9 = r9.getLocales()
                java.lang.String r9 = r9.toLanguageTags()
                java.lang.String r1 = ","
                java.lang.String[] r9 = p371v5.C6552b0.m13303G(r9, r1)
                goto La2
            L8e:
                java.lang.String[] r1 = new java.lang.String[r1]
                java.util.Locale r9 = r9.locale
                r4 = 21
                if (r3 < r4) goto L9b
                java.lang.String r9 = r9.toLanguageTag()
                goto L9f
            L9b:
                java.lang.String r9 = r9.toString()
            L9f:
                r1[r0] = r9
                r9 = r1
            La2:
                r1 = 0
            La3:
                int r3 = r9.length
                if (r1 >= r3) goto Lb1
                r3 = r9[r1]
                java.lang.String r3 = p371v5.C6552b0.m13298B(r3)
                r9[r1] = r3
                int r1 = r1 + 1
                goto La3
            Lb1:
                r1 = 0
            Lb2:
                int r3 = r9.length
                if (r1 >= r3) goto Lc1
                r3 = r9[r1]
                int r3 = p325s5.C5964d.m12415d(r7, r3, r0)
                if (r3 <= 0) goto Lbe
                goto Lc5
            Lbe:
                int r1 = r1 + 1
                goto Lb2
            Lc1:
                r1 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
            Lc5:
                r6.f22945f0 = r1
                r6.f22946g0 = r3
            Lc9:
                b9.n<java.lang.String> r9 = r8.f23035o0
                int r9 = r9.size()
                if (r0 >= r9) goto Le6
                java.lang.String r9 = r7.f8896j0
                if (r9 == 0) goto Le3
                b9.n<java.lang.String> r1 = r8.f23035o0
                java.lang.Object r1 = r1.get(r0)
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto Le3
                r2 = r0
                goto Le6
            Le3:
                int r0 = r0 + 1
                goto Lc9
            Le6:
                r6.f22951l0 = r2
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(p325s5.C5964d.b r1) {
                r0 = this;
                s5.d$b r1 = (p325s5.C5964d.b) r1
                int r1 = r0.m12421e(r1)
                return r1
        }

        /* renamed from: e */
        public int m12421e(p325s5.C5964d.b r7) {
                r6 = this;
                boolean r0 = r6.f22938Y
                if (r0 == 0) goto Lb
                boolean r0 = r6.f22941b0
                if (r0 == 0) goto Lb
                b9.b0<java.lang.Integer> r0 = p325s5.C5964d.f22934e
                goto L11
            Lb:
                b9.b0<java.lang.Integer> r0 = p325s5.C5964d.f22934e
                b9.b0 r0 = r0.mo2256b()
            L11:
                b9.j r1 = p026b9.AbstractC0706j.f3964a
                boolean r2 = r6.f22941b0
                boolean r3 = r7.f22941b0
                b9.j r1 = r1.mo2294d(r2, r3)
                int r2 = r6.f22943d0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r7.f22943d0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                b9.f0 r4 = p026b9.C0699f0.f3953Y
                b9.j r1 = r1.mo2293c(r2, r3, r4)
                int r2 = r6.f22942c0
                int r3 = r7.f22942c0
                b9.j r1 = r1.mo2291a(r2, r3)
                int r2 = r6.f22944e0
                int r3 = r7.f22944e0
                b9.j r1 = r1.mo2291a(r2, r3)
                boolean r2 = r6.f22938Y
                boolean r3 = r7.f22938Y
                b9.j r1 = r1.mo2294d(r2, r3)
                int r2 = r6.f22951l0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r7.f22951l0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                b9.j r1 = r1.mo2293c(r2, r3, r4)
                int r2 = r6.f22950k0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r7.f22950k0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                s5.d$d r5 = r6.f22940a0
                boolean r5 = r5.f23039s0
                if (r5 == 0) goto L6e
                b9.b0<java.lang.Integer> r5 = p325s5.C5964d.f22934e
                b9.b0 r5 = r5.mo2256b()
                goto L70
            L6e:
                b9.b0<java.lang.Integer> r5 = p325s5.C5964d.f22935f
            L70:
                b9.j r1 = r1.mo2293c(r2, r3, r5)
                boolean r2 = r6.f22947h0
                boolean r3 = r7.f22947h0
                b9.j r1 = r1.mo2294d(r2, r3)
                int r2 = r6.f22945f0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r7.f22945f0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                b9.j r1 = r1.mo2293c(r2, r3, r4)
                int r2 = r6.f22946g0
                int r3 = r7.f22946g0
                b9.j r1 = r1.mo2291a(r2, r3)
                int r2 = r6.f22948i0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r7.f22948i0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                b9.j r1 = r1.mo2293c(r2, r3, r0)
                int r2 = r6.f22949j0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r7.f22949j0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                b9.j r1 = r1.mo2293c(r2, r3, r0)
                int r2 = r6.f22950k0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r7.f22950k0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.String r4 = r6.f22939Z
                java.lang.String r7 = r7.f22939Z
                boolean r7 = p371v5.C6552b0.m13308a(r4, r7)
                if (r7 == 0) goto Lcb
                goto Lcd
            Lcb:
                b9.b0<java.lang.Integer> r0 = p325s5.C5964d.f22935f
            Lcd:
                b9.j r7 = r1.mo2293c(r2, r3, r0)
                int r7 = r7.mo2296f()
                return r7
        }
    }

    /* renamed from: s5.d$c */
    public static final class c implements java.lang.Comparable<p325s5.C5964d.c> {

        /* renamed from: Y */
        public final boolean f22952Y;

        /* renamed from: Z */
        public final boolean f22953Z;

        public c(p088f4.C2003e0 r3, int r4) {
                r2 = this;
                r2.<init>()
                int r3 = r3.f8888b0
                r0 = 1
                r3 = r3 & r0
                r1 = 0
                if (r3 == 0) goto Lb
                goto Lc
            Lb:
                r0 = 0
            Lc:
                r2.f22952Y = r0
                boolean r3 = p325s5.C5964d.m12417f(r4, r1)
                r2.f22953Z = r3
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(p325s5.C5964d.c r1) {
                r0 = this;
                s5.d$c r1 = (p325s5.C5964d.c) r1
                int r1 = r0.m12422e(r1)
                return r1
        }

        /* renamed from: e */
        public int m12422e(p325s5.C5964d.c r4) {
                r3 = this;
                b9.j r0 = p026b9.AbstractC0706j.f3964a
                boolean r1 = r3.f22953Z
                boolean r2 = r4.f22953Z
                b9.j r0 = r0.mo2294d(r1, r2)
                boolean r1 = r3.f22952Y
                boolean r4 = r4.f22952Y
                b9.j r4 = r0.mo2294d(r1, r4)
                int r4 = r4.mo2296f()
                return r4
        }
    }

    /* renamed from: s5.d$d */
    public static final class d extends p325s5.C5972l {

        /* renamed from: K0 */
        public static final p325s5.C5964d.d f22954K0 = null;

        /* renamed from: A0 */
        public final boolean f22955A0;

        /* renamed from: B0 */
        public final boolean f22956B0;

        /* renamed from: C0 */
        public final boolean f22957C0;

        /* renamed from: D0 */
        public final boolean f22958D0;

        /* renamed from: E0 */
        public final boolean f22959E0;

        /* renamed from: F0 */
        public final boolean f22960F0;

        /* renamed from: G0 */
        public final boolean f22961G0;

        /* renamed from: H0 */
        public final boolean f22962H0;

        /* renamed from: I0 */
        public final android.util.SparseArray<java.util.Map<p108g5.C2273i0, p325s5.C5964d.f>> f22963I0;

        /* renamed from: J0 */
        public final android.util.SparseBooleanArray f22964J0;

        /* renamed from: x0 */
        public final int f22965x0;

        /* renamed from: y0 */
        public final boolean f22966y0;

        /* renamed from: z0 */
        public final boolean f22967z0;

        static {
                s5.d$e r0 = new s5.d$e
                r0.<init>()
                s5.d$d r0 = r0.m12427e()
                p325s5.C5964d.d.f22954K0 = r0
                return
        }

        public d(p325s5.C5964d.e r1, p325s5.C5964d.a r2) {
                r0 = this;
                r0.<init>(r1)
                boolean r2 = r1.f22979y
                r0.f22966y0 = r2
                boolean r2 = r1.f22980z
                r0.f22967z0 = r2
                boolean r2 = r1.f22968A
                r0.f22955A0 = r2
                boolean r2 = r1.f22969B
                r0.f22956B0 = r2
                boolean r2 = r1.f22970C
                r0.f22957C0 = r2
                boolean r2 = r1.f22971D
                r0.f22958D0 = r2
                boolean r2 = r1.f22972E
                r0.f22959E0 = r2
                int r2 = r1.f22973F
                r0.f22965x0 = r2
                boolean r2 = r1.f22974G
                r0.f22960F0 = r2
                boolean r2 = r1.f22975H
                r0.f22961G0 = r2
                boolean r2 = r1.f22976I
                r0.f22962H0 = r2
                android.util.SparseArray<java.util.Map<g5.i0, s5.d$f>> r2 = r1.f22977J
                r0.f22963I0 = r2
                android.util.SparseBooleanArray r1 = r1.f22978K
                r0.f22964J0 = r1
                return
        }

        /* renamed from: b */
        public static java.lang.String m12423b(int r1) {
                r0 = 36
                java.lang.String r1 = java.lang.Integer.toString(r1, r0)
                return r1
        }

        @Override // p325s5.C5972l
        public boolean equals(java.lang.Object r11) {
                r10 = this;
                r0 = 1
                if (r10 != r11) goto L4
                return r0
            L4:
                r1 = 0
                if (r11 == 0) goto Lf0
                java.lang.Class<s5.d$d> r2 = p325s5.C5964d.d.class
                java.lang.Class r3 = r11.getClass()
                if (r2 == r3) goto L11
                goto Lf0
            L11:
                s5.d$d r11 = (p325s5.C5964d.d) r11
                boolean r2 = super.equals(r11)
                if (r2 == 0) goto Lee
                boolean r2 = r10.f22966y0
                boolean r3 = r11.f22966y0
                if (r2 != r3) goto Lee
                boolean r2 = r10.f22967z0
                boolean r3 = r11.f22967z0
                if (r2 != r3) goto Lee
                boolean r2 = r10.f22955A0
                boolean r3 = r11.f22955A0
                if (r2 != r3) goto Lee
                boolean r2 = r10.f22956B0
                boolean r3 = r11.f22956B0
                if (r2 != r3) goto Lee
                boolean r2 = r10.f22957C0
                boolean r3 = r11.f22957C0
                if (r2 != r3) goto Lee
                boolean r2 = r10.f22958D0
                boolean r3 = r11.f22958D0
                if (r2 != r3) goto Lee
                boolean r2 = r10.f22959E0
                boolean r3 = r11.f22959E0
                if (r2 != r3) goto Lee
                int r2 = r10.f22965x0
                int r3 = r11.f22965x0
                if (r2 != r3) goto Lee
                boolean r2 = r10.f22960F0
                boolean r3 = r11.f22960F0
                if (r2 != r3) goto Lee
                boolean r2 = r10.f22961G0
                boolean r3 = r11.f22961G0
                if (r2 != r3) goto Lee
                boolean r2 = r10.f22962H0
                boolean r3 = r11.f22962H0
                if (r2 != r3) goto Lee
                android.util.SparseBooleanArray r2 = r10.f22964J0
                android.util.SparseBooleanArray r3 = r11.f22964J0
                int r4 = r2.size()
                int r5 = r3.size()
                if (r5 == r4) goto L6b
            L69:
                r2 = 0
                goto L7d
            L6b:
                r5 = 0
            L6c:
                if (r5 >= r4) goto L7c
                int r6 = r2.keyAt(r5)
                int r6 = r3.indexOfKey(r6)
                if (r6 >= 0) goto L79
                goto L69
            L79:
                int r5 = r5 + 1
                goto L6c
            L7c:
                r2 = 1
            L7d:
                if (r2 == 0) goto Lee
                android.util.SparseArray<java.util.Map<g5.i0, s5.d$f>> r2 = r10.f22963I0
                android.util.SparseArray<java.util.Map<g5.i0, s5.d$f>> r11 = r11.f22963I0
                int r3 = r2.size()
                int r4 = r11.size()
                if (r4 == r3) goto L8f
            L8d:
                r11 = 0
                goto Leb
            L8f:
                r4 = 0
            L90:
                if (r4 >= r3) goto Lea
                int r5 = r2.keyAt(r4)
                int r5 = r11.indexOfKey(r5)
                if (r5 < 0) goto L8d
                java.lang.Object r6 = r2.valueAt(r4)
                java.util.Map r6 = (java.util.Map) r6
                java.lang.Object r5 = r11.valueAt(r5)
                java.util.Map r5 = (java.util.Map) r5
                int r7 = r6.size()
                int r8 = r5.size()
                if (r8 == r7) goto Lb3
                goto Le1
            Lb3:
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            Lbb:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto Le3
                java.lang.Object r7 = r6.next()
                java.util.Map$Entry r7 = (java.util.Map.Entry) r7
                java.lang.Object r8 = r7.getKey()
                g5.i0 r8 = (p108g5.C2273i0) r8
                boolean r9 = r5.containsKey(r8)
                if (r9 == 0) goto Le1
                java.lang.Object r7 = r7.getValue()
                java.lang.Object r8 = r5.get(r8)
                boolean r7 = p371v5.C6552b0.m13308a(r7, r8)
                if (r7 != 0) goto Lbb
            Le1:
                r5 = 0
                goto Le4
            Le3:
                r5 = 1
            Le4:
                if (r5 != 0) goto Le7
                goto L8d
            Le7:
                int r4 = r4 + 1
                goto L90
            Lea:
                r11 = 1
            Leb:
                if (r11 == 0) goto Lee
                goto Lef
            Lee:
                r0 = 0
            Lef:
                return r0
            Lf0:
                return r1
        }

        @Override // p325s5.C5972l
        public int hashCode() {
                r3 = this;
                int r0 = super.hashCode()
                r1 = 31
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r2 = r3.f22966y0
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.f22967z0
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.f22955A0
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.f22956B0
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.f22957C0
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.f22958D0
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.f22959E0
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f22965x0
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.f22960F0
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.f22961G0
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r1 = r3.f22962H0
                int r0 = r0 + r1
                return r0
        }
    }

    /* renamed from: s5.d$e */
    public static final class e extends p325s5.C5972l.a {

        /* renamed from: A */
        public boolean f22968A;

        /* renamed from: B */
        public boolean f22969B;

        /* renamed from: C */
        public boolean f22970C;

        /* renamed from: D */
        public boolean f22971D;

        /* renamed from: E */
        public boolean f22972E;

        /* renamed from: F */
        public int f22973F;

        /* renamed from: G */
        public boolean f22974G;

        /* renamed from: H */
        public boolean f22975H;

        /* renamed from: I */
        public boolean f22976I;

        /* renamed from: J */
        public final android.util.SparseArray<java.util.Map<p108g5.C2273i0, p325s5.C5964d.f>> f22977J;

        /* renamed from: K */
        public final android.util.SparseBooleanArray f22978K;

        /* renamed from: y */
        public boolean f22979y;

        /* renamed from: z */
        public boolean f22980z;

        @java.lang.Deprecated
        public e() {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.f22977J = r0
                android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
                r0.<init>()
                r1.f22978K = r0
                r1.m12428f()
                return
        }

        public e(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r1.mo12424b(r2)
                r0 = 1
                r1.mo12426d(r2, r0)
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                r1.f22977J = r2
                android.util.SparseBooleanArray r2 = new android.util.SparseBooleanArray
                r2.<init>()
                r1.f22978K = r2
                r1.m12428f()
                return
        }

        public e(android.os.Bundle r10, p325s5.C5964d.a r11) {
                r9 = this;
                r9.<init>(r10)
                s5.d$d r11 = p325s5.C5964d.d.f22954K0
                r0 = 1000(0x3e8, float:1.401E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                boolean r1 = r11.f22966y0
                boolean r0 = r10.getBoolean(r0, r1)
                r9.f22979y = r0
                r0 = 1001(0x3e9, float:1.403E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                boolean r1 = r11.f22967z0
                boolean r0 = r10.getBoolean(r0, r1)
                r9.f22980z = r0
                r0 = 1002(0x3ea, float:1.404E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                boolean r1 = r11.f22955A0
                boolean r0 = r10.getBoolean(r0, r1)
                r9.f22968A = r0
                r0 = 1003(0x3eb, float:1.406E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                boolean r1 = r11.f22956B0
                boolean r0 = r10.getBoolean(r0, r1)
                r9.f22969B = r0
                r0 = 1004(0x3ec, float:1.407E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                boolean r1 = r11.f22957C0
                boolean r0 = r10.getBoolean(r0, r1)
                r9.f22970C = r0
                r0 = 1005(0x3ed, float:1.408E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                boolean r1 = r11.f22958D0
                boolean r0 = r10.getBoolean(r0, r1)
                r9.f22971D = r0
                r0 = 1006(0x3ee, float:1.41E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                boolean r1 = r11.f22959E0
                boolean r0 = r10.getBoolean(r0, r1)
                r9.f22972E = r0
                r0 = 1007(0x3ef, float:1.411E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                int r1 = r11.f22965x0
                int r0 = r10.getInt(r0, r1)
                r9.f22973F = r0
                r0 = 1008(0x3f0, float:1.413E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                boolean r1 = r11.f22960F0
                boolean r0 = r10.getBoolean(r0, r1)
                r9.f22974G = r0
                r0 = 1009(0x3f1, float:1.414E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                boolean r1 = r11.f22961G0
                boolean r0 = r10.getBoolean(r0, r1)
                r9.f22975H = r0
                r0 = 1010(0x3f2, float:1.415E-42)
                java.lang.String r0 = p325s5.C5964d.d.m12423b(r0)
                boolean r11 = r11.f22962H0
                boolean r11 = r10.getBoolean(r0, r11)
                r9.f22976I = r11
                android.util.SparseArray r11 = new android.util.SparseArray
                r11.<init>()
                r9.f22977J = r11
                r11 = 1011(0x3f3, float:1.417E-42)
                java.lang.String r11 = p325s5.C5964d.d.m12423b(r11)
                int[] r11 = r10.getIntArray(r11)
                f4.i$a<g5.i0> r0 = p108g5.C2273i0.f10377c0
                r1 = 1012(0x3f4, float:1.418E-42)
                java.lang.String r1 = p325s5.C5964d.d.m12423b(r1)
                java.util.ArrayList r1 = r10.getParcelableArrayList(r1)
                b9.n<java.lang.Object> r2 = p026b9.C0693c0.f3898c0
                java.util.List r0 = p371v5.C6551b.m13295b(r0, r1, r2)
                f4.i$a<s5.d$f> r1 = p325s5.C5964d.f.f22981b0
                r2 = 1013(0x3f5, float:1.42E-42)
                java.lang.String r2 = p325s5.C5964d.d.m12423b(r2)
                android.util.SparseArray r2 = r10.getSparseParcelableArray(r2)
                android.util.SparseArray r3 = new android.util.SparseArray
                r3.<init>()
                r4 = 0
                if (r2 != 0) goto Ld7
                goto Lfe
            Ld7:
                android.util.SparseArray r3 = new android.util.SparseArray
                int r5 = r2.size()
                r3.<init>(r5)
                r5 = 0
            Le1:
                int r6 = r2.size()
                if (r5 >= r6) goto Lfe
                int r6 = r2.keyAt(r5)
                java.lang.Object r7 = r2.valueAt(r5)
                android.os.Bundle r7 = (android.os.Bundle) r7
                r8 = r1
                androidx.room.a r8 = (androidx.room.C0618a) r8
                f4.i r7 = r8.mo2149h(r7)
                r3.put(r6, r7)
                int r5 = r5 + 1
                goto Le1
            Lfe:
                if (r11 == 0) goto L145
                int r1 = r11.length
                int r2 = r0.size()
                if (r1 == r2) goto L108
                goto L145
            L108:
                r1 = 0
            L109:
                int r2 = r11.length
                if (r1 >= r2) goto L145
                r2 = r11[r1]
                java.lang.Object r5 = r0.get(r1)
                g5.i0 r5 = (p108g5.C2273i0) r5
                java.lang.Object r6 = r3.get(r1)
                s5.d$f r6 = (p325s5.C5964d.f) r6
                android.util.SparseArray<java.util.Map<g5.i0, s5.d$f>> r7 = r9.f22977J
                java.lang.Object r7 = r7.get(r2)
                java.util.Map r7 = (java.util.Map) r7
                if (r7 != 0) goto L12e
                java.util.HashMap r7 = new java.util.HashMap
                r7.<init>()
                android.util.SparseArray<java.util.Map<g5.i0, s5.d$f>> r8 = r9.f22977J
                r8.put(r2, r7)
            L12e:
                boolean r2 = r7.containsKey(r5)
                if (r2 == 0) goto L13f
                java.lang.Object r2 = r7.get(r5)
                boolean r2 = p371v5.C6552b0.m13308a(r2, r6)
                if (r2 == 0) goto L13f
                goto L142
            L13f:
                r7.put(r5, r6)
            L142:
                int r1 = r1 + 1
                goto L109
            L145:
                r11 = 1014(0x3f6, float:1.421E-42)
                java.lang.String r11 = p325s5.C5964d.d.m12423b(r11)
                int[] r10 = r10.getIntArray(r11)
                if (r10 != 0) goto L157
                android.util.SparseBooleanArray r10 = new android.util.SparseBooleanArray
                r10.<init>()
                goto L16a
            L157:
                android.util.SparseBooleanArray r11 = new android.util.SparseBooleanArray
                int r0 = r10.length
                r11.<init>(r0)
                int r0 = r10.length
            L15e:
                if (r4 >= r0) goto L169
                r1 = r10[r4]
                r2 = 1
                r11.append(r1, r2)
                int r4 = r4 + 1
                goto L15e
            L169:
                r10 = r11
            L16a:
                r9.f22978K = r10
                return
        }

        @Override // p325s5.C5972l.a
        /* renamed from: b */
        public p325s5.C5972l.a mo12424b(android.content.Context r1) {
                r0 = this;
                super.mo12424b(r1)
                return r0
        }

        @Override // p325s5.C5972l.a
        /* renamed from: c */
        public p325s5.C5972l.a mo12425c(int r1, int r2, boolean r3) {
                r0 = this;
                r0.f23051i = r1
                r0.f23052j = r2
                r0.f23053k = r3
                return r0
        }

        @Override // p325s5.C5972l.a
        /* renamed from: d */
        public p325s5.C5972l.a mo12426d(android.content.Context r1, boolean r2) {
                r0 = this;
                super.mo12426d(r1, r2)
                return r0
        }

        /* renamed from: e */
        public p325s5.C5964d.d m12427e() {
                r2 = this;
                s5.d$d r0 = new s5.d$d
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        /* renamed from: f */
        public final void m12428f() {
                r2 = this;
                r0 = 1
                r2.f22979y = r0
                r1 = 0
                r2.f22980z = r1
                r2.f22968A = r0
                r2.f22969B = r0
                r2.f22970C = r1
                r2.f22971D = r1
                r2.f22972E = r1
                r2.f22973F = r1
                r2.f22974G = r0
                r2.f22975H = r1
                r2.f22976I = r0
                return
        }
    }

    /* renamed from: s5.d$f */
    public static final class f implements p088f4.InterfaceC2014i {

        /* renamed from: b0 */
        public static final p088f4.InterfaceC2014i.a<p325s5.C5964d.f> f22981b0 = null;

        /* renamed from: Y */
        public final int f22982Y;

        /* renamed from: Z */
        public final int[] f22983Z;

        /* renamed from: a0 */
        public final int f22984a0;

        static {
                androidx.room.a r0 = androidx.room.C0618a.f3664n0
                p325s5.C5964d.f.f22981b0 = r0
                return
        }

        public f(int r1, int[] r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f22982Y = r1
                int r1 = r2.length
                int[] r1 = java.util.Arrays.copyOf(r2, r1)
                r0.f22983Z = r1
                r0.f22984a0 = r3
                java.util.Arrays.sort(r1)
                return
        }

        /* renamed from: a */
        public static java.lang.String m12429a(int r1) {
                r0 = 36
                java.lang.String r1 = java.lang.Integer.toString(r1, r0)
                return r1
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L2b
                java.lang.Class<s5.d$f> r2 = p325s5.C5964d.f.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L2b
            L10:
                s5.d$f r5 = (p325s5.C5964d.f) r5
                int r2 = r4.f22982Y
                int r3 = r5.f22982Y
                if (r2 != r3) goto L29
                int[] r2 = r4.f22983Z
                int[] r3 = r5.f22983Z
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 == 0) goto L29
                int r2 = r4.f22984a0
                int r5 = r5.f22984a0
                if (r2 != r5) goto L29
                goto L2a
            L29:
                r0 = 0
            L2a:
                return r0
            L2b:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f22982Y
                int r0 = r0 * 31
                int[] r1 = r2.f22983Z
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r2.f22984a0
                int r1 = r1 + r0
                return r1
        }
    }

    /* renamed from: s5.d$g */
    public static final class g implements java.lang.Comparable<p325s5.C5964d.g> {

        /* renamed from: Y */
        public final boolean f22985Y;

        /* renamed from: Z */
        public final boolean f22986Z;

        /* renamed from: a0 */
        public final boolean f22987a0;

        /* renamed from: b0 */
        public final boolean f22988b0;

        /* renamed from: c0 */
        public final int f22989c0;

        /* renamed from: d0 */
        public final int f22990d0;

        /* renamed from: e0 */
        public final int f22991e0;

        /* renamed from: f0 */
        public final int f22992f0;

        /* renamed from: g0 */
        public final boolean f22993g0;

        public g(p088f4.C2003e0 r7, p325s5.C5964d.d r8, int r9, java.lang.String r10) {
                r6 = this;
                r6.<init>()
                r0 = 0
                boolean r9 = p325s5.C5964d.m12417f(r9, r0)
                r6.f22986Z = r9
                int r9 = r7.f8888b0
                int r1 = r8.f22965x0
                int r1 = ~r1
                r9 = r9 & r1
                r1 = r9 & 1
                r2 = 1
                if (r1 == 0) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = 0
            L18:
                r6.f22987a0 = r1
                r9 = r9 & 2
                if (r9 == 0) goto L20
                r9 = 1
                goto L21
            L20:
                r9 = 0
            L21:
                r6.f22988b0 = r9
                r9 = 2147483647(0x7fffffff, float:NaN)
                b9.n<java.lang.String> r1 = r8.f23036p0
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L35
                java.lang.String r1 = ""
                b9.n r1 = p026b9.AbstractC0714n.m2306D(r1)
                goto L37
            L35:
                b9.n<java.lang.String> r1 = r8.f23036p0
            L37:
                r3 = 0
            L38:
                int r4 = r1.size()
                if (r3 >= r4) goto L51
                java.lang.Object r4 = r1.get(r3)
                java.lang.String r4 = (java.lang.String) r4
                boolean r5 = r8.f23038r0
                int r4 = p325s5.C5964d.m12415d(r7, r4, r5)
                if (r4 <= 0) goto L4e
                r9 = r3
                goto L52
            L4e:
                int r3 = r3 + 1
                goto L38
            L51:
                r4 = 0
            L52:
                r6.f22989c0 = r9
                r6.f22990d0 = r4
                int r9 = r7.f8889c0
                int r1 = r8.f23037q0
                r9 = r9 & r1
                int r9 = java.lang.Integer.bitCount(r9)
                r6.f22991e0 = r9
                int r1 = r7.f8889c0
                r1 = r1 & 1088(0x440, float:1.525E-42)
                if (r1 == 0) goto L69
                r1 = 1
                goto L6a
            L69:
                r1 = 0
            L6a:
                r6.f22993g0 = r1
                java.lang.String r1 = p325s5.C5964d.m12419i(r10)
                if (r1 != 0) goto L74
                r1 = 1
                goto L75
            L74:
                r1 = 0
            L75:
                int r7 = p325s5.C5964d.m12415d(r7, r10, r1)
                r6.f22992f0 = r7
                if (r4 > 0) goto L91
                b9.n<java.lang.String> r8 = r8.f23036p0
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L87
                if (r9 > 0) goto L91
            L87:
                boolean r8 = r6.f22987a0
                if (r8 != 0) goto L91
                boolean r8 = r6.f22988b0
                if (r8 == 0) goto L92
                if (r7 <= 0) goto L92
            L91:
                r0 = 1
            L92:
                r6.f22985Y = r0
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(p325s5.C5964d.g r1) {
                r0 = this;
                s5.d$g r1 = (p325s5.C5964d.g) r1
                int r1 = r0.m12430e(r1)
                return r1
        }

        /* renamed from: e */
        public int m12430e(p325s5.C5964d.g r7) {
                r6 = this;
                b9.j r0 = p026b9.AbstractC0706j.f3964a
                boolean r1 = r6.f22986Z
                boolean r2 = r7.f22986Z
                b9.j r0 = r0.mo2294d(r1, r2)
                int r1 = r6.f22989c0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r7.f22989c0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                b9.a0 r3 = p026b9.C0689a0.f3895Y
                b9.f0 r4 = p026b9.C0699f0.f3953Y
                b9.j r0 = r0.mo2293c(r1, r2, r4)
                int r1 = r6.f22990d0
                int r2 = r7.f22990d0
                b9.j r0 = r0.mo2291a(r1, r2)
                int r1 = r6.f22991e0
                int r2 = r7.f22991e0
                b9.j r0 = r0.mo2291a(r1, r2)
                boolean r1 = r6.f22987a0
                boolean r2 = r7.f22987a0
                b9.j r0 = r0.mo2294d(r1, r2)
                boolean r1 = r6.f22988b0
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                boolean r2 = r7.f22988b0
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                int r5 = r6.f22990d0
                if (r5 != 0) goto L47
                goto L48
            L47:
                r3 = r4
            L48:
                b9.j r0 = r0.mo2293c(r1, r2, r3)
                int r1 = r6.f22992f0
                int r2 = r7.f22992f0
                b9.j r0 = r0.mo2291a(r1, r2)
                int r1 = r6.f22991e0
                if (r1 != 0) goto L60
                boolean r1 = r6.f22993g0
                boolean r7 = r7.f22993g0
                b9.j r0 = r0.mo2295e(r1, r7)
            L60:
                int r7 = r0.mo2296f()
                return r7
        }
    }

    /* renamed from: s5.d$h */
    public static final class h implements java.lang.Comparable<p325s5.C5964d.h> {

        /* renamed from: Y */
        public final boolean f22994Y;

        /* renamed from: Z */
        public final p325s5.C5964d.d f22995Z;

        /* renamed from: a0 */
        public final boolean f22996a0;

        /* renamed from: b0 */
        public final boolean f22997b0;

        /* renamed from: c0 */
        public final int f22998c0;

        /* renamed from: d0 */
        public final int f22999d0;

        /* renamed from: e0 */
        public final int f23000e0;

        public h(p088f4.C2003e0 r7, p325s5.C5964d.d r8, int r9, boolean r10) {
                r6 = this;
                r6.<init>()
                r6.f22995Z = r8
                r0 = 0
                r1 = 1
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.f8901o0
                if (r4 == r3) goto L14
                int r5 = r8.f23019Y
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.f8902p0
                if (r4 == r3) goto L1c
                int r5 = r8.f23020Z
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.f8903q0
                int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f23021a0
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f8892f0
                if (r4 == r3) goto L31
                int r5 = r8.f23022b0
                if (r4 > r5) goto L33
            L31:
                r4 = 1
                goto L34
            L33:
                r4 = 0
            L34:
                r6.f22994Y = r4
                if (r10 == 0) goto L5e
                int r10 = r7.f8901o0
                if (r10 == r3) goto L40
                int r4 = r8.f23023c0
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.f8902p0
                if (r10 == r3) goto L48
                int r4 = r8.f23024d0
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.f8903q0
                int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r2 == 0) goto L55
                int r2 = r8.f23025e0
                float r2 = (float) r2
                int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f8892f0
                if (r10 == r3) goto L5f
                int r2 = r8.f23026f0
                if (r10 < r2) goto L5e
                goto L5f
            L5e:
                r1 = 0
            L5f:
                r6.f22996a0 = r1
                boolean r9 = p325s5.C5964d.m12417f(r9, r0)
                r6.f22997b0 = r9
                int r9 = r7.f8892f0
                r6.f22998c0 = r9
                int r9 = r7.f8901o0
                if (r9 == r3) goto L76
                int r10 = r7.f8902p0
                if (r10 != r3) goto L74
                goto L76
            L74:
                int r3 = r9 * r10
            L76:
                r6.f22999d0 = r3
                r9 = 2147483647(0x7fffffff, float:NaN)
            L7b:
                b9.n<java.lang.String> r10 = r8.f23030j0
                int r10 = r10.size()
                if (r0 >= r10) goto L98
                java.lang.String r10 = r7.f8896j0
                if (r10 == 0) goto L95
                b9.n<java.lang.String> r1 = r8.f23030j0
                java.lang.Object r1 = r1.get(r0)
                boolean r10 = r10.equals(r1)
                if (r10 == 0) goto L95
                r9 = r0
                goto L98
            L95:
                int r0 = r0 + 1
                goto L7b
            L98:
                r6.f23000e0 = r9
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(p325s5.C5964d.h r1) {
                r0 = this;
                s5.d$h r1 = (p325s5.C5964d.h) r1
                int r1 = r0.m12431e(r1)
                return r1
        }

        /* renamed from: e */
        public int m12431e(p325s5.C5964d.h r6) {
                r5 = this;
                boolean r0 = r5.f22994Y
                if (r0 == 0) goto Lb
                boolean r0 = r5.f22997b0
                if (r0 == 0) goto Lb
                b9.b0<java.lang.Integer> r0 = p325s5.C5964d.f22934e
                goto L11
            Lb:
                b9.b0<java.lang.Integer> r0 = p325s5.C5964d.f22934e
                b9.b0 r0 = r0.mo2256b()
            L11:
                b9.j r1 = p026b9.AbstractC0706j.f3964a
                boolean r2 = r5.f22997b0
                boolean r3 = r6.f22997b0
                b9.j r1 = r1.mo2294d(r2, r3)
                boolean r2 = r5.f22994Y
                boolean r3 = r6.f22994Y
                b9.j r1 = r1.mo2294d(r2, r3)
                boolean r2 = r5.f22996a0
                boolean r3 = r6.f22996a0
                b9.j r1 = r1.mo2294d(r2, r3)
                int r2 = r5.f23000e0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.f23000e0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                b9.f0 r4 = p026b9.C0699f0.f3953Y
                b9.j r1 = r1.mo2293c(r2, r3, r4)
                int r2 = r5.f22998c0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.f22998c0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                s5.d$d r4 = r5.f22995Z
                boolean r4 = r4.f23039s0
                if (r4 == 0) goto L56
                b9.b0<java.lang.Integer> r4 = p325s5.C5964d.f22934e
                b9.b0 r4 = r4.mo2256b()
                goto L58
            L56:
                b9.b0<java.lang.Integer> r4 = p325s5.C5964d.f22935f
            L58:
                b9.j r1 = r1.mo2293c(r2, r3, r4)
                int r2 = r5.f22999d0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.f22999d0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                b9.j r1 = r1.mo2293c(r2, r3, r0)
                int r2 = r5.f22998c0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r6 = r6.f22998c0
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                b9.j r6 = r1.mo2293c(r2, r6, r0)
                int r6 = r6.mo2296f()
                return r6
        }
    }

    static {
            r0 = 0
            int[] r0 = new int[r0]
            p325s5.C5964d.f22933d = r0
            e5.d r0 = p070e5.C1519d.f7377Z
            b9.b0 r0 = p026b9.AbstractC0691b0.m2258a(r0)
            p325s5.C5964d.f22934e = r0
            r5.f r0 = p305r5.C5793f.f22472a0
            b9.b0 r0 = p026b9.AbstractC0691b0.m2258a(r0)
            p325s5.C5964d.f22935f = r0
            return
    }

    public C5964d(android.content.Context r3) {
            r2 = this;
            s5.a$b r0 = new s5.a$b
            r0.<init>()
            s5.d$d r1 = p325s5.C5964d.d.f22954K0
            s5.d$e r1 = new s5.d$e
            r1.<init>(r3)
            s5.d$d r3 = r1.m12427e()
            r2.<init>()
            r2.f22936b = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r3)
            r2.f22937c = r0
            return
    }

    /* renamed from: d */
    public static int m12415d(p088f4.C2003e0 r2, java.lang.String r3, boolean r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L10
            java.lang.String r0 = r2.f8887a0
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L10
            r2 = 4
            return r2
        L10:
            java.lang.String r3 = m12419i(r3)
            java.lang.String r2 = r2.f8887a0
            java.lang.String r2 = m12419i(r2)
            r0 = 0
            if (r2 == 0) goto L48
            if (r3 != 0) goto L20
            goto L48
        L20:
            boolean r4 = r2.startsWith(r3)
            if (r4 != 0) goto L46
            boolean r4 = r3.startsWith(r2)
            if (r4 == 0) goto L2d
            goto L46
        L2d:
            int r4 = p371v5.C6552b0.f25624a
            java.lang.String r4 = "-"
            r1 = 2
            java.lang.String[] r2 = r2.split(r4, r1)
            r2 = r2[r0]
            java.lang.String[] r3 = r3.split(r4, r1)
            r3 = r3[r0]
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L45
            return r1
        L45:
            return r0
        L46:
            r2 = 3
            return r2
        L48:
            if (r4 == 0) goto L4d
            if (r2 != 0) goto L4d
            r0 = 1
        L4d:
            return r0
    }

    /* renamed from: e */
    public static java.util.List<java.lang.Integer> m12416e(p108g5.C2271h0 r12, int r13, int r14, boolean r15) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f10372Y
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r12.f10372Y
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto Laf
            if (r14 != r2) goto L20
            goto Laf
        L20:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L24:
            int r5 = r12.f10372Y
            r6 = 1
            if (r3 >= r5) goto L80
            f4.e0[] r5 = r12.f10373Z
            r5 = r5[r3]
            int r7 = r5.f8901o0
            if (r7 <= 0) goto L7d
            int r8 = r5.f8902p0
            if (r8 <= 0) goto L7d
            if (r15 == 0) goto L45
            if (r7 <= r8) goto L3b
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            if (r13 <= r14) goto L3f
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r9 == r6) goto L45
            r6 = r13
            r9 = r14
            goto L47
        L45:
            r9 = r13
            r6 = r14
        L47:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L57
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = p371v5.C6552b0.m13313f(r11, r7)
            r6.<init>(r9, r7)
            goto L61
        L57:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = p371v5.C6552b0.m13313f(r10, r8)
            r7.<init>(r8, r6)
            r6 = r7
        L61:
            int r7 = r5.f8901o0
            int r5 = r5.f8902p0
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L7d
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L7d
            if (r8 >= r4) goto L7d
            r4 = r8
        L7d:
            int r3 = r3 + 1
            goto L24
        L80:
            if (r4 == r2) goto Laf
            int r13 = r0.size()
            int r13 = r13 - r6
        L87:
            if (r13 < 0) goto Laf
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            f4.e0[] r15 = r12.f10373Z
            r14 = r15[r14]
            int r15 = r14.f8901o0
            r1 = -1
            if (r15 == r1) goto La4
            int r14 = r14.f8902p0
            if (r14 != r1) goto La1
            goto La4
        La1:
            int r15 = r15 * r14
            goto La5
        La4:
            r15 = -1
        La5:
            if (r15 == r1) goto La9
            if (r15 <= r4) goto Lac
        La9:
            r0.remove(r13)
        Lac:
            int r13 = r13 + (-1)
            goto L87
        Laf:
            return r0
    }

    /* renamed from: f */
    public static boolean m12417f(int r1, boolean r2) {
            r1 = r1 & 7
            r0 = 4
            if (r1 == r0) goto Ld
            if (r2 == 0) goto Lb
            r2 = 3
            if (r1 != r2) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }

    /* renamed from: g */
    public static boolean m12418g(p088f4.C2003e0 r2, java.lang.String r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
            int r0 = r2.f8889c0
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = m12417f(r4, r1)
            if (r0 == 0) goto L47
            r4 = r4 & r5
            if (r4 == 0) goto L47
            if (r3 == 0) goto L1b
            java.lang.String r4 = r2.f8896j0
            boolean r3 = p371v5.C6552b0.m13308a(r4, r3)
            if (r3 == 0) goto L47
        L1b:
            int r3 = r2.f8901o0
            r4 = -1
            if (r3 == r4) goto L24
            if (r10 > r3) goto L47
            if (r3 > r6) goto L47
        L24:
            int r3 = r2.f8902p0
            if (r3 == r4) goto L2c
            if (r11 > r3) goto L47
            if (r3 > r7) goto L47
        L2c:
            float r3 = r2.f8903q0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L3e
            float r5 = (float) r12
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L47
            float r5 = (float) r8
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L47
        L3e:
            int r2 = r2.f8892f0
            if (r2 == r4) goto L47
            if (r13 > r2) goto L47
            if (r2 > r9) goto L47
            r1 = 1
        L47:
            return r1
    }

    /* renamed from: i */
    public static java.lang.String m12419i(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Le
            java.lang.String r0 = "und"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    /* renamed from: h */
    public final void m12420h(android.util.SparseArray<android.util.Pair<p325s5.C5971k.a, java.lang.Integer>> r3, p325s5.C5971k.a r4, int r5) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            g5.h0 r0 = r4.f23016Y
            f4.e0[] r0 = r0.f10373Z
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.f8896j0
            int r0 = p371v5.C6567q.m13377g(r0)
            java.lang.Object r1 = r3.get(r0)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 == 0) goto L24
            java.lang.Object r1 = r1.first
            s5.k$a r1 = (p325s5.C5971k.a) r1
            b9.n<java.lang.Integer> r1 = r1.f23017Z
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2f
        L24:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.util.Pair r4 = android.util.Pair.create(r4, r5)
            r3.put(r0, r4)
        L2f:
            return
    }
}
