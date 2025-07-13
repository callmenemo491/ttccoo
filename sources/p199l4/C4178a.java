package p199l4;

/* renamed from: l4.a */
/* loaded from: classes.dex */
public final class C4178a {

    /* renamed from: m */
    public static final android.support.v4.media.MediaMetadataCompat f17307m = null;

    /* renamed from: a */
    public final android.support.v4.media.session.MediaSessionCompat f17308a;

    /* renamed from: b */
    public final android.os.Looper f17309b;

    /* renamed from: c */
    public final p199l4.C4178a.c f17310c;

    /* renamed from: d */
    public final java.util.ArrayList<p199l4.C4178a.b> f17311d;

    /* renamed from: e */
    public final java.util.ArrayList<p199l4.C4178a.b> f17312e;

    /* renamed from: f */
    public p199l4.C4178a.d[] f17313f;

    /* renamed from: g */
    public java.util.Map<java.lang.String, p199l4.C4178a.d> f17314g;

    /* renamed from: h */
    public p199l4.C4178a.f f17315h;

    /* renamed from: i */
    public p088f4.InterfaceC2054x0 f17316i;

    /* renamed from: j */
    public p199l4.C4178a.g f17317j;

    /* renamed from: k */
    public p199l4.C4178a.h f17318k;

    /* renamed from: l */
    public long f17319l;

    /* renamed from: l4.a$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l4.a$b */
    public interface b {
        /* renamed from: c */
        boolean mo7748c(p088f4.InterfaceC2054x0 r1, java.lang.String r2, android.os.Bundle r3, android.os.ResultReceiver r4);
    }

    /* renamed from: l4.a$c */
    public class c extends android.support.v4.media.session.MediaSessionCompat.AbstractC0161a implements p088f4.InterfaceC2054x0.e {

        /* renamed from: d0 */
        public int f17320d0;

        /* renamed from: e0 */
        public int f17321e0;

        /* renamed from: f0 */
        public final /* synthetic */ p199l4.C4178a f17322f0;

        public c(p199l4.C4178a r1, p199l4.C4178a.a r2) {
                r0 = this;
                r0.f17322f0 = r1
                r0.<init>()
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: A */
        public void mo296A(android.net.Uri r4, android.os.Bundle r5) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 8192(0x2000, double:4.0474E-320)
                boolean r0 = p199l4.C4178a.m9290a(r0, r1)
                if (r0 == 0) goto L12
                l4.a r0 = r3.f17322f0
                l4.a$g r0 = r0.f17317j
                r1 = 1
                r0.mo9301k(r4, r1, r5)
            L12:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: B */
        public void mo297B() {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 16384(0x4000, double:8.095E-320)
                boolean r0 = p199l4.C4178a.m9290a(r0, r1)
                if (r0 == 0) goto L12
                l4.a r0 = r3.f17322f0
                l4.a$g r0 = r0.f17317j
                r1 = 0
                r0.mo9297e(r1)
            L12:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: C */
        public void mo298C(java.lang.String r4, android.os.Bundle r5) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 32768(0x8000, double:1.61895E-319)
                boolean r0 = p199l4.C4178a.m9290a(r0, r1)
                if (r0 == 0) goto L13
                l4.a r0 = r3.f17322f0
                l4.a$g r0 = r0.f17317j
                r1 = 0
                r0.mo9300j(r4, r1, r5)
            L13:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: D */
        public void mo299D(java.lang.String r4, android.os.Bundle r5) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 65536(0x10000, double:3.2379E-319)
                boolean r0 = p199l4.C4178a.m9290a(r0, r1)
                if (r0 == 0) goto L13
                l4.a r0 = r3.f17322f0
                l4.a$g r0 = r0.f17317j
                r1 = 0
                r0.mo9299g(r4, r1, r5)
            L13:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: E */
        public void mo300E(android.net.Uri r4, android.os.Bundle r5) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 131072(0x20000, double:6.4758E-319)
                boolean r0 = p199l4.C4178a.m9290a(r0, r1)
                if (r0 == 0) goto L13
                l4.a r0 = r3.f17322f0
                l4.a$g r0 = r0.f17317j
                r1 = 0
                r0.mo9301k(r4, r1, r5)
            L13:
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: F */
        public /* synthetic */ void mo2885F(p121h4.C2461d r1) {
                r0 = this;
                p088f4.C2058z0.m5462a(r0, r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: G */
        public void mo301G(android.support.v4.media.MediaDescriptionCompat r1) {
                r0 = this;
                l4.a r1 = r0.f17322f0
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: H */
        public void mo302H() {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 8
                boolean r0 = p199l4.C4178a.m9291b(r0, r1)
                if (r0 == 0) goto L11
                l4.a r0 = r3.f17322f0
                f4.x0 r0 = r0.f17316i
                r0.mo5222U()
            L11:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: I */
        public void mo303I(long r4) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 256(0x100, double:1.265E-321)
                boolean r0 = p199l4.C4178a.m9291b(r0, r1)
                if (r0 == 0) goto L15
                l4.a r0 = r3.f17322f0
                f4.x0 r0 = r0.f17316i
                int r1 = r0.mo2824F()
                r0.mo2857r(r1, r4)
            L15:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: J */
        public void mo304J(boolean r1) {
                r0 = this;
                l4.a r1 = r0.f17322f0
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: K */
        public void mo305K(float r4) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 4194304(0x400000, double:2.0722615E-317)
                boolean r0 = p199l4.C4178a.m9291b(r0, r1)
                if (r0 == 0) goto L22
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 <= 0) goto L22
                l4.a r0 = r3.f17322f0
                f4.x0 r0 = r0.f17316i
                f4.w0 r1 = r0.mo2837e()
                f4.w0 r2 = new f4.w0
                float r1 = r1.f9373Z
                r2.<init>(r4, r1)
                r0.mo2836c(r2)
            L22:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: L */
        public void mo306L(android.support.v4.media.RatingCompat r1) {
                r0 = this;
                l4.a r1 = r0.f17322f0
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: M */
        public /* synthetic */ void mo2886M(p088f4.C2032o r1) {
                r0 = this;
                p088f4.C2058z0.m5465d(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: N */
        public /* synthetic */ void mo2887N(int r1) {
                r0 = this;
                p088f4.C2058z0.m5475n(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: O */
        public /* synthetic */ void mo2888O(boolean r1, int r2) {
                r0 = this;
                p088f4.C2058z0.m5473l(r0, r1, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: P */
        public void mo307P(android.support.v4.media.RatingCompat r1, android.os.Bundle r2) {
                r0 = this;
                l4.a r1 = r0.f17322f0
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: Q */
        public /* synthetic */ void mo2889Q(p088f4.InterfaceC2054x0.f r1, p088f4.InterfaceC2054x0.f r2, int r3) {
                r0 = this;
                p088f4.C2058z0.m5479r(r0, r1, r2, r3)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: R */
        public void mo2890R(p088f4.InterfaceC2054x0 r7, p088f4.InterfaceC2054x0.d r8) {
                r6 = this;
                v5.k r0 = r8.f9381a
                android.util.SparseBooleanArray r0 = r0.f25655a
                r1 = 11
                boolean r0 = r0.get(r1)
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L24
                int r0 = r6.f17320d0
                int r3 = r7.mo2824F()
                if (r0 == r3) goto L21
                l4.a r0 = r6.f17322f0
                l4.a$h r0 = r0.f17318k
                if (r0 == 0) goto L1f
                r0.mo9302a(r7)
            L1f:
                r0 = 1
                goto L22
            L21:
                r0 = 0
            L22:
                r3 = 1
                goto L26
            L24:
                r0 = 0
                r3 = 0
            L26:
                v5.k r4 = r8.f9381a
                android.util.SparseBooleanArray r4 = r4.f25655a
                boolean r4 = r4.get(r1)
                if (r4 == 0) goto L52
                f4.n1 r0 = r7.mo2829M()
                int r0 = r0.mo5180q()
                int r4 = r7.mo2824F()
                l4.a r5 = r6.f17322f0
                l4.a$h r5 = r5.f17318k
                if (r5 == 0) goto L46
                r5.mo9307l(r7)
                goto L4e
            L46:
                int r5 = r6.f17321e0
                if (r5 != r0) goto L4e
                int r5 = r6.f17320d0
                if (r5 == r4) goto L4f
            L4e:
                r3 = 1
            L4f:
                r6.f17321e0 = r0
                r0 = 1
            L52:
                int r7 = r7.mo2824F()
                r6.f17320d0 = r7
                r7 = 5
                int[] r7 = new int[r7]
                r7 = {x0090: FILL_ARRAY_DATA , data: [4, 5, 7, 8, 12} // fill-array
                boolean r7 = r8.m5422a(r7)
                if (r7 == 0) goto L65
                r3 = 1
            L65:
                int[] r7 = new int[r2]
                r4 = 9
                r7[r1] = r4
                boolean r7 = r8.m5422a(r7)
                if (r7 == 0) goto L7f
                l4.a r7 = r6.f17322f0
                l4.a$h r8 = r7.f17318k
                if (r8 == 0) goto L80
                f4.x0 r7 = r7.f17316i
                if (r7 == 0) goto L80
                r8.mo9307l(r7)
                goto L80
            L7f:
                r2 = r3
            L80:
                if (r2 == 0) goto L87
                l4.a r7 = r6.f17322f0
                r7.m9294e()
            L87:
                if (r0 == 0) goto L8e
                l4.a r7 = r6.f17322f0
                r7.m9293d()
            L8e:
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: S */
        public /* synthetic */ void mo2891S(p088f4.InterfaceC2054x0.b r1) {
                r0 = this;
                p088f4.C2058z0.m5463b(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: T */
        public /* synthetic */ void mo2892T(p088f4.C2034o1 r1) {
                r0 = this;
                p088f4.C2058z0.m5486y(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: U */
        public /* synthetic */ void mo2893U(p108g5.C2273i0 r1, p325s5.C5970j r2) {
                r0 = this;
                p088f4.C2056y0.m5444u(r0, r1, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: V */
        public void mo308V(int r4) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 262144(0x40000, double:1.295163E-318)
                boolean r0 = p199l4.C4178a.m9291b(r0, r1)
                if (r0 == 0) goto L1e
                r0 = 2
                r1 = 1
                if (r4 == r1) goto L16
                if (r4 == r0) goto L17
                r1 = 3
                if (r4 == r1) goto L17
                r0 = 0
                goto L17
            L16:
                r0 = 1
            L17:
                l4.a r4 = r3.f17322f0
                f4.x0 r4 = r4.f17316i
                r4.mo2855q(r0)
            L1e:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: W */
        public void mo309W(int r4) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 2097152(0x200000, double:1.036131E-317)
                boolean r0 = p199l4.C4178a.m9291b(r0, r1)
                if (r0 == 0) goto L19
                r0 = 1
                if (r4 == r0) goto L12
                r1 = 2
                if (r4 == r1) goto L12
                r0 = 0
            L12:
                l4.a r4 = r3.f17322f0
                f4.x0 r4 = r4.f17316i
                r4.mo2863x(r0)
            L19:
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: X */
        public /* synthetic */ void mo2894X(boolean r1) {
                r0 = this;
                p088f4.C2058z0.m5482u(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: Y */
        public /* synthetic */ void mo2895Y(p088f4.C2048u0 r1) {
                r0 = this;
                p088f4.C2058z0.m5477p(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: Z */
        public /* synthetic */ void mo2896Z(int r1, int r2) {
                r0 = this;
                p088f4.C2058z0.m5484w(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: a */
        public /* synthetic */ void mo2897a() {
                r0 = this;
                p088f4.C2058z0.m5480s(r0)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: a0 */
        public /* synthetic */ void mo2898a0(p088f4.C2018j0 r1, int r2) {
                r0 = this;
                p088f4.C2058z0.m5470i(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: b */
        public /* synthetic */ void mo2899b() {
                r0 = this;
                p088f4.C2056y0.m5441r(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: b0 */
        public void mo310b0() {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 32
                boolean r0 = p199l4.C4178a.m9292c(r0, r1)
                if (r0 == 0) goto L13
                l4.a r0 = r3.f17322f0
                l4.a$h r1 = r0.f17318k
                f4.x0 r0 = r0.f17316i
                r1.mo9306i(r0)
            L13:
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: c */
        public /* synthetic */ void mo2900c(boolean r1) {
                r0 = this;
                p088f4.C2058z0.m5483v(r0, r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: c0 */
        public void mo311c0() {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 16
                boolean r0 = p199l4.C4178a.m9292c(r0, r1)
                if (r0 == 0) goto L13
                l4.a r0 = r3.f17322f0
                l4.a$h r1 = r0.f17318k
                f4.x0 r0 = r0.f17316i
                r1.mo9303b(r0)
            L13:
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: d */
        public /* synthetic */ void mo2901d(java.util.List r1) {
                r0 = this;
                p088f4.C2058z0.m5464c(r0, r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: d0 */
        public void mo312d0(long r4) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 4096(0x1000, double:2.0237E-320)
                boolean r0 = p199l4.C4178a.m9292c(r0, r1)
                if (r0 == 0) goto L13
                l4.a r0 = r3.f17322f0
                l4.a$h r1 = r0.f17318k
                f4.x0 r0 = r0.f17316i
                r1.mo9304d(r0, r4)
            L13:
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: e */
        public /* synthetic */ void mo2902e(p387w5.C6813p r1) {
                r0 = this;
                p088f4.C2058z0.m5487z(r0, r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: e0 */
        public void mo313e0() {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 1
                boolean r0 = p199l4.C4178a.m9291b(r0, r1)
                if (r0 == 0) goto L18
                l4.a r0 = r3.f17322f0
                f4.x0 r0 = r0.f17316i
                r0.stop()
                l4.a r0 = r3.f17322f0
                f4.x0 r0 = r0.f17316i
                r0.mo5236v()
            L18:
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: f */
        public /* synthetic */ void mo2903f(p427y4.C7110a r1) {
                r0 = this;
                p088f4.C2058z0.m5472k(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: f0 */
        public /* synthetic */ void mo2904f0(p088f4.C2052w0 r1) {
                r0 = this;
                p088f4.C2058z0.m5474m(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: g */
        public /* synthetic */ void mo2905g(int r1) {
                r0 = this;
                p088f4.C2058z0.m5476o(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: h */
        public /* synthetic */ void mo2906h(boolean r1, int r2) {
                r0 = this;
                p088f4.C2056y0.m5437n(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: i0 */
        public /* synthetic */ void mo2908i0(int r1, boolean r2) {
                r0 = this;
                p088f4.C2058z0.m5466e(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: j */
        public /* synthetic */ void mo2909j(boolean r1) {
                r0 = this;
                p088f4.C2056y0.m5428e(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: j0 */
        public /* synthetic */ void mo2910j0(boolean r1) {
                r0 = this;
                p088f4.C2058z0.m5469h(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: k */
        public /* synthetic */ void mo2911k(int r1) {
                r0 = this;
                p088f4.C2056y0.m5438o(r0, r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: l */
        public void mo316l(android.support.v4.media.MediaDescriptionCompat r1) {
                r0 = this;
                l4.a r1 = r0.f17322f0
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: m */
        public void mo317m(android.support.v4.media.MediaDescriptionCompat r1, int r2) {
                r0 = this;
                l4.a r1 = r0.f17322f0
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: n */
        public /* synthetic */ void mo2912n(p088f4.C2021k0 r1) {
                r0 = this;
                p088f4.C2058z0.m5471j(r0, r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: o */
        public void mo318o(java.lang.String r5, android.os.Bundle r6, android.os.ResultReceiver r7) {
                r4 = this;
                l4.a r0 = r4.f17322f0
                f4.x0 r0 = r0.f17316i
                if (r0 == 0) goto L4c
                r0 = 0
                r1 = 0
            L8:
                l4.a r2 = r4.f17322f0
                java.util.ArrayList<l4.a$b> r2 = r2.f17311d
                int r2 = r2.size()
                if (r1 >= r2) goto L2a
                l4.a r2 = r4.f17322f0
                java.util.ArrayList<l4.a$b> r2 = r2.f17311d
                java.lang.Object r2 = r2.get(r1)
                l4.a$b r2 = (p199l4.C4178a.b) r2
                l4.a r3 = r4.f17322f0
                f4.x0 r3 = r3.f17316i
                boolean r2 = r2.mo7748c(r3, r5, r6, r7)
                if (r2 == 0) goto L27
                return
            L27:
                int r1 = r1 + 1
                goto L8
            L2a:
                l4.a r1 = r4.f17322f0
                java.util.ArrayList<l4.a$b> r1 = r1.f17312e
                int r1 = r1.size()
                if (r0 >= r1) goto L4c
                l4.a r1 = r4.f17322f0
                java.util.ArrayList<l4.a$b> r1 = r1.f17312e
                java.lang.Object r1 = r1.get(r0)
                l4.a$b r1 = (p199l4.C4178a.b) r1
                l4.a r2 = r4.f17322f0
                f4.x0 r2 = r2.f17316i
                boolean r1 = r1.mo7748c(r2, r5, r6, r7)
                if (r1 == 0) goto L49
                return
            L49:
                int r0 = r0 + 1
                goto L2a
            L4c:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: p */
        public void mo319p(java.lang.String r3, android.os.Bundle r4) {
                r2 = this;
                l4.a r0 = r2.f17322f0
                f4.x0 r1 = r0.f17316i
                if (r1 == 0) goto L24
                java.util.Map<java.lang.String, l4.a$d> r0 = r0.f17314g
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L24
                l4.a r0 = r2.f17322f0
                java.util.Map<java.lang.String, l4.a$d> r0 = r0.f17314g
                java.lang.Object r0 = r0.get(r3)
                l4.a$d r0 = (p199l4.C4178a.d) r0
                l4.a r1 = r2.f17322f0
                f4.x0 r1 = r1.f17316i
                r0.m9296b(r1, r3, r4)
                l4.a r3 = r2.f17322f0
                r3.m9294e()
            L24:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: q */
        public void mo320q() {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 64
                boolean r0 = p199l4.C4178a.m9291b(r0, r1)
                if (r0 == 0) goto L11
                l4.a r0 = r3.f17322f0
                f4.x0 r0 = r0.f17316i
                r0.mo5221T()
            L11:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: r */
        public boolean mo321r(android.content.Intent r2) {
                r1 = this;
                l4.a r0 = r1.f17322f0
                java.util.Objects.requireNonNull(r0)
                boolean r2 = super.mo321r(r2)
                if (r2 == 0) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                return r2
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: s */
        public void mo322s() {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 2
                boolean r0 = p199l4.C4178a.m9291b(r0, r1)
                if (r0 == 0) goto L11
                l4.a r0 = r3.f17322f0
                f4.x0 r0 = r0.f17316i
                r0.mo5234j()
            L11:
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: t */
        public /* synthetic */ void mo2913t(p088f4.AbstractC2031n1 r1, int r2) {
                r0 = this;
                p088f4.C2058z0.m5485x(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: u */
        public /* synthetic */ void mo2914u(int r1) {
                r0 = this;
                p088f4.C2058z0.m5481t(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: v */
        public /* synthetic */ void mo2915v(boolean r1) {
                r0 = this;
                p088f4.C2058z0.m5468g(r0, r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: w */
        public void mo323w() {
                r4 = this;
                l4.a r0 = r4.f17322f0
                r1 = 4
                boolean r0 = p199l4.C4178a.m9291b(r0, r1)
                if (r0 == 0) goto L4a
                l4.a r0 = r4.f17322f0
                f4.x0 r0 = r0.f17316i
                int r0 = r0.mo2850n()
                r1 = 1
                if (r0 != r1) goto L25
                l4.a r0 = r4.f17322f0
                l4.a$g r2 = r0.f17317j
                if (r2 == 0) goto L1f
                r2.mo9297e(r1)
                goto L40
            L1f:
                f4.x0 r0 = r0.f17316i
                r0.mo2852o()
                goto L40
            L25:
                l4.a r0 = r4.f17322f0
                f4.x0 r0 = r0.f17316i
                int r0 = r0.mo2850n()
                r1 = 4
                if (r0 != r1) goto L40
                l4.a r0 = r4.f17322f0
                f4.x0 r0 = r0.f17316i
                int r1 = r0.mo2824F()
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0.mo2857r(r1, r2)
            L40:
                l4.a r0 = r4.f17322f0
                f4.x0 r0 = r0.f17316i
                java.util.Objects.requireNonNull(r0)
                r0.mo5235p()
            L4a:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: x */
        public void mo324x(java.lang.String r4, android.os.Bundle r5) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 1024(0x400, double:5.06E-321)
                boolean r0 = p199l4.C4178a.m9290a(r0, r1)
                if (r0 == 0) goto L12
                l4.a r0 = r3.f17322f0
                l4.a$g r0 = r0.f17317j
                r1 = 1
                r0.mo9300j(r4, r1, r5)
            L12:
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: y */
        public /* synthetic */ void mo2916y(p088f4.C2048u0 r1) {
                r0 = this;
                p088f4.C2058z0.m5478q(r0, r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
        /* renamed from: z */
        public void mo325z(java.lang.String r4, android.os.Bundle r5) {
                r3 = this;
                l4.a r0 = r3.f17322f0
                r1 = 2048(0x800, double:1.012E-320)
                boolean r0 = p199l4.C4178a.m9290a(r0, r1)
                if (r0 == 0) goto L12
                l4.a r0 = r3.f17322f0
                l4.a$g r0 = r0.f17317j
                r1 = 1
                r0.mo9299g(r4, r1, r5)
            L12:
                return
        }
    }

    /* renamed from: l4.a$d */
    public interface d {
        /* renamed from: a */
        android.support.v4.media.session.PlaybackStateCompat.CustomAction m9295a(p088f4.InterfaceC2054x0 r1);

        /* renamed from: b */
        void m9296b(p088f4.InterfaceC2054x0 r1, java.lang.String r2, android.os.Bundle r3);
    }

    /* renamed from: l4.a$e */
    public static final class e implements p199l4.C4178a.f {

        /* renamed from: a */
        public final android.support.v4.media.session.MediaControllerCompat f17323a;

        /* renamed from: b */
        public final java.lang.String f17324b;

        public e(android.support.v4.media.session.MediaControllerCompat r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f17323a = r1
                java.lang.String r1 = ""
                r0.f17324b = r1
                return
        }
    }

    /* renamed from: l4.a$f */
    public interface f {
    }

    /* renamed from: l4.a$g */
    public interface g extends p199l4.C4178a.b {
        /* renamed from: e */
        void mo9297e(boolean r1);

        /* renamed from: f */
        long mo9298f();

        /* renamed from: g */
        void mo9299g(java.lang.String r1, boolean r2, android.os.Bundle r3);

        /* renamed from: j */
        void mo9300j(java.lang.String r1, boolean r2, android.os.Bundle r3);

        /* renamed from: k */
        void mo9301k(android.net.Uri r1, boolean r2, android.os.Bundle r3);
    }

    /* renamed from: l4.a$h */
    public interface h extends p199l4.C4178a.b {
        /* renamed from: a */
        void mo9302a(p088f4.InterfaceC2054x0 r1);

        /* renamed from: b */
        void mo9303b(p088f4.InterfaceC2054x0 r1);

        /* renamed from: d */
        void mo9304d(p088f4.InterfaceC2054x0 r1, long r2);

        /* renamed from: h */
        long mo9305h(p088f4.InterfaceC2054x0 r1);

        /* renamed from: i */
        void mo9306i(p088f4.InterfaceC2054x0 r1);

        /* renamed from: l */
        void mo9307l(p088f4.InterfaceC2054x0 r1);

        /* renamed from: m */
        long mo9308m(p088f4.InterfaceC2054x0 r1);
    }

    static {
            java.lang.String r0 = "goog.exo.mediasession"
            p088f4.C1997c0.m5181a(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.support.v4.media.MediaMetadataCompat r1 = new android.support.v4.media.MediaMetadataCompat
            r1.<init>(r0)
            p199l4.C4178a.f17307m = r1
            return
    }

    public C4178a(android.support.v4.media.session.MediaSessionCompat r6) {
            r5 = this;
            r5.<init>()
            r5.f17308a = r6
            android.os.Looper r0 = p371v5.C6552b0.m13322o()
            r5.f17309b = r0
            l4.a$c r1 = new l4.a$c
            r2 = 0
            r1.<init>(r5, r2)
            r5.f17310c = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.f17311d = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.f17312e = r3
            r3 = 0
            l4.a$d[] r3 = new p199l4.C4178a.d[r3]
            r5.f17313f = r3
            java.util.Map r3 = java.util.Collections.emptyMap()
            r5.f17314g = r3
            l4.a$e r3 = new l4.a$e
            android.support.v4.media.session.MediaControllerCompat r4 = r6.f524b
            r3.<init>(r4, r2)
            r5.f17315h = r3
            r2 = 2360143(0x24034f, double:1.1660656E-317)
            r5.f17319l = r2
            android.support.v4.media.session.MediaSessionCompat$b r2 = r6.f523a
            r3 = 3
            r2.mo329a(r3)
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r0)
            r6.m288e(r1, r2)
            return
    }

    /* renamed from: a */
    public static boolean m9290a(p199l4.C4178a r2, long r3) {
            l4.a$g r2 = r2.f17317j
            if (r2 == 0) goto L13
            long r0 = r2.mo9298f()
            long r2 = r3 & r0
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L11
            goto L13
        L11:
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }

    /* renamed from: b */
    public static boolean m9291b(p199l4.C4178a r2, long r3) {
            f4.x0 r0 = r2.f17316i
            if (r0 == 0) goto L11
            long r0 = r2.f17319l
            long r2 = r3 & r0
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lf
            goto L11
        Lf:
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }

    /* renamed from: c */
    public static boolean m9292c(p199l4.C4178a r2, long r3) {
            f4.x0 r0 = r2.f17316i
            if (r0 == 0) goto L17
            l4.a$h r2 = r2.f17318k
            if (r2 == 0) goto L17
            long r0 = r2.mo9308m(r0)
            long r2 = r3 & r0
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L15
            goto L17
        L15:
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            return r2
    }

    /* renamed from: d */
    public final void m9293d() {
            r12 = this;
            l4.a$f r0 = r12.f17315h
            if (r0 == 0) goto L27a
            f4.x0 r1 = r12.f17316i
            if (r1 == 0) goto L27a
            l4.a$e r0 = (p199l4.C4178a.e) r0
            java.util.Objects.requireNonNull(r0)
            f4.n1 r2 = r1.mo2829M()
            boolean r2 = r2.m5344r()
            if (r2 == 0) goto L1b
            android.support.v4.media.MediaMetadataCompat r0 = p199l4.C4178a.f17307m
            goto L27c
        L1b:
            android.support.v4.media.MediaMetadataCompat$b r2 = new android.support.v4.media.MediaMetadataCompat$b
            r2.<init>()
            boolean r3 = r1.mo2840h()
            if (r3 == 0) goto L2d
            r3 = 1
            java.lang.String r5 = "android.media.metadata.ADVERTISEMENT"
            r2.m235c(r5, r3)
        L2d:
            boolean r3 = r1.mo5218J()
            r4 = -1
            if (r3 != 0) goto L48
            long r6 = r1.mo2828L()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L43
            goto L48
        L43:
            long r6 = r1.mo2828L()
            goto L49
        L48:
            r6 = r4
        L49:
            java.lang.String r1 = "android.media.metadata.DURATION"
            r2.m235c(r1, r6)
            android.support.v4.media.session.MediaControllerCompat r1 = r0.f17323a
            android.support.v4.media.session.PlaybackStateCompat r1 = r1.m260b()
            long r6 = r1.f573h0
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L275
            android.support.v4.media.session.MediaControllerCompat r1 = r0.f17323a
            android.support.v4.media.session.MediaControllerCompat$b r1 = r1.f505a
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r1 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r1
            android.media.session.MediaController r1 = r1.f507a
            java.util.List r1 = r1.getQueue()
            r3 = 0
            if (r1 == 0) goto L6e
            java.util.List r1 = android.support.v4.media.session.MediaSessionCompat.QueueItem.m290a(r1)
            goto L6f
        L6e:
            r1 = r3
        L6f:
            r4 = 0
        L70:
            if (r1 == 0) goto L275
            int r5 = r1.size()
            if (r4 >= r5) goto L275
            java.lang.Object r5 = r1.get(r4)
            android.support.v4.media.session.MediaSessionCompat$QueueItem r5 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r5
            long r8 = r5.f527Z
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L271
            android.support.v4.media.MediaDescriptionCompat r1 = r5.f526Y
            android.os.Bundle r4 = r1.f491e0
            if (r4 == 0) goto L218
            java.util.Set r5 = r4.keySet()
            java.util.Iterator r5 = r5.iterator()
        L92:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L218
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r4.get(r6)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto Lc6
            java.lang.String r8 = r0.f17324b
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto Lbb
            java.lang.String r6 = r8.concat(r6)
            goto Lc0
        Lbb:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        Lc0:
            java.lang.String r7 = (java.lang.String) r7
            r2.m236d(r6, r7)
            goto L92
        Lc6:
            boolean r8 = r7 instanceof java.lang.CharSequence
            java.lang.String r9 = "The "
            r10 = 1
            if (r8 == 0) goto L116
            java.lang.String r8 = r0.f17324b
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r11 = r6.length()
            if (r11 == 0) goto Le2
            java.lang.String r6 = r8.concat(r6)
            goto Le7
        Le2:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        Le7:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            s.a<java.lang.String, java.lang.Integer> r8 = android.support.v4.media.MediaMetadataCompat.f494b0
            int r11 = r8.m12340e(r6)
            if (r11 < 0) goto Lf3
            r11 = 1
            goto Lf4
        Lf3:
            r11 = 0
        Lf4:
            if (r11 == 0) goto L10f
            java.lang.Object r8 = r8.getOrDefault(r6, r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r10) goto L103
            goto L10f
        L103:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = " key cannot be used to put a CharSequence"
            java.lang.String r1 = android.support.v4.media.C0145d.m257a(r9, r6, r1)
            r0.<init>(r1)
            throw r0
        L10f:
            android.os.Bundle r8 = r2.f501a
            r8.putCharSequence(r6, r7)
            goto L92
        L116:
            boolean r8 = r7 instanceof java.lang.Long
            if (r8 == 0) goto L13b
            java.lang.String r8 = r0.f17324b
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L12f
            java.lang.String r6 = r8.concat(r6)
            goto L134
        L12f:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L134:
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            goto L160
        L13b:
            boolean r8 = r7 instanceof java.lang.Integer
            if (r8 == 0) goto L165
            java.lang.String r8 = r0.f17324b
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L154
            java.lang.String r6 = r8.concat(r6)
            goto L159
        L154:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L159:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            long r7 = (long) r7
        L160:
            r2.m235c(r6, r7)
            goto L92
        L165:
            boolean r8 = r7 instanceof android.graphics.Bitmap
            if (r8 == 0) goto L18a
            java.lang.String r8 = r0.f17324b
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L17e
            java.lang.String r6 = r8.concat(r6)
            goto L183
        L17e:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L183:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            r2.m234b(r6, r7)
            goto L92
        L18a:
            boolean r8 = r7 instanceof android.support.v4.media.RatingCompat
            if (r8 == 0) goto L92
            java.lang.String r8 = r0.f17324b
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r11 = r6.length()
            if (r11 == 0) goto L1a3
            java.lang.String r6 = r8.concat(r6)
            goto L1a8
        L1a3:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L1a8:
            android.support.v4.media.RatingCompat r7 = (android.support.v4.media.RatingCompat) r7
            s.a<java.lang.String, java.lang.Integer> r8 = android.support.v4.media.MediaMetadataCompat.f494b0
            int r11 = r8.m12340e(r6)
            if (r11 < 0) goto L1b3
            goto L1b4
        L1b3:
            r10 = 0
        L1b4:
            if (r10 == 0) goto L1d0
            java.lang.Object r8 = r8.getOrDefault(r6, r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r10 = 3
            if (r8 != r10) goto L1c4
            goto L1d0
        L1c4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = " key cannot be used to put a Rating"
            java.lang.String r1 = android.support.v4.media.C0145d.m257a(r9, r6, r1)
            r0.<init>(r1)
            throw r0
        L1d0:
            android.os.Bundle r8 = r2.f501a
            java.lang.Object r9 = r7.f504a0
            if (r9 != 0) goto L20f
            boolean r9 = r7.m241e()
            if (r9 == 0) goto L207
            int r9 = r7.f502Y
            switch(r9) {
                case 1: goto L1fe;
                case 2: goto L1f5;
                case 3: goto L1ec;
                case 4: goto L1ec;
                case 5: goto L1ec;
                case 6: goto L1e3;
                default: goto L1e1;
            }
        L1e1:
            r7 = r3
            goto L211
        L1e3:
            float r9 = r7.m238b()
            android.media.Rating r9 = android.support.v4.media.RatingCompat.C0141b.m250h(r9)
            goto L20d
        L1ec:
            float r10 = r7.m239c()
            android.media.Rating r9 = android.support.v4.media.RatingCompat.C0141b.m251i(r9, r10)
            goto L20d
        L1f5:
            boolean r9 = r7.m242f()
            android.media.Rating r9 = android.support.v4.media.RatingCompat.C0141b.m252j(r9)
            goto L20d
        L1fe:
            boolean r9 = r7.m240d()
            android.media.Rating r9 = android.support.v4.media.RatingCompat.C0141b.m249g(r9)
            goto L20d
        L207:
            int r9 = r7.f502Y
            android.media.Rating r9 = android.support.v4.media.RatingCompat.C0141b.m253k(r9)
        L20d:
            r7.f504a0 = r9
        L20f:
            java.lang.Object r7 = r7.f504a0
        L211:
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            r8.putParcelable(r6, r7)
            goto L92
        L218:
            java.lang.CharSequence r0 = r1.f486Z
            if (r0 == 0) goto L22a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "android.media.metadata.TITLE"
            r2.m236d(r3, r0)
            java.lang.String r3 = "android.media.metadata.DISPLAY_TITLE"
            r2.m236d(r3, r0)
        L22a:
            java.lang.CharSequence r0 = r1.f487a0
            if (r0 == 0) goto L237
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "android.media.metadata.DISPLAY_SUBTITLE"
            r2.m236d(r3, r0)
        L237:
            java.lang.CharSequence r0 = r1.f488b0
            if (r0 == 0) goto L244
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "android.media.metadata.DISPLAY_DESCRIPTION"
            r2.m236d(r3, r0)
        L244:
            android.graphics.Bitmap r0 = r1.f489c0
            if (r0 == 0) goto L24d
            java.lang.String r3 = "android.media.metadata.DISPLAY_ICON"
            r2.m234b(r3, r0)
        L24d:
            android.net.Uri r0 = r1.f490d0
            if (r0 == 0) goto L25a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "android.media.metadata.DISPLAY_ICON_URI"
            r2.m236d(r3, r0)
        L25a:
            java.lang.String r0 = r1.f485Y
            if (r0 == 0) goto L263
            java.lang.String r3 = "android.media.metadata.MEDIA_ID"
            r2.m236d(r3, r0)
        L263:
            android.net.Uri r0 = r1.f492f0
            if (r0 == 0) goto L275
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "android.media.metadata.MEDIA_URI"
            r2.m236d(r1, r0)
            goto L275
        L271:
            int r4 = r4 + 1
            goto L70
        L275:
            android.support.v4.media.MediaMetadataCompat r0 = r2.m233a()
            goto L27c
        L27a:
            android.support.v4.media.MediaMetadataCompat r0 = p199l4.C4178a.f17307m
        L27c:
            android.support.v4.media.session.MediaSessionCompat r1 = r12.f17308a
            android.support.v4.media.session.MediaSessionCompat$b r1 = r1.f523a
            r1.mo341m(r0)
            return
    }

    /* renamed from: e */
    public final void m9294e() {
            r26 = this;
            r0 = r26
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            f4.x0 r1 = r0.f17316i
            r2 = 0
            r5 = 0
            r6 = 257024(0x3ec00, double:1.269867E-318)
            if (r1 != 0) goto L56
            l4.a$g r1 = r0.f17317j
            if (r1 != 0) goto L17
            r8 = r2
            goto L1d
        L17:
            long r1 = r1.mo9298f()
            long r1 = r1 & r6
            r8 = r1
        L1d:
            r2 = 0
            r3 = 0
            r7 = 0
            long r12 = android.os.SystemClock.elapsedRealtime()
            android.support.v4.media.session.MediaSessionCompat r1 = r0.f17308a
            android.support.v4.media.session.MediaSessionCompat$b r1 = r1.f523a
            r1.mo344q(r5)
            android.support.v4.media.session.MediaSessionCompat r1 = r0.f17308a
            android.support.v4.media.session.MediaSessionCompat$b r1 = r1.f523a
            r1.mo328F(r5)
            android.support.v4.media.session.MediaSessionCompat r15 = r0.f17308a
            android.support.v4.media.session.PlaybackStateCompat r11 = new android.support.v4.media.session.PlaybackStateCompat
            r1 = r11
            r5 = 0
            r17 = 0
            r10 = 0
            r16 = 0
            r18 = r11
            r11 = r16
            r19 = -1
            r21 = r15
            r15 = r19
            r1.<init>(r2, r3, r5, r7, r8, r10, r11, r12, r14, r15, r17)
            r1 = r21
            android.support.v4.media.session.MediaSessionCompat$b r1 = r1.f523a
            r2 = r18
        L52:
            r1.mo335g(r2)
            return
        L56:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            l4.a$d[] r8 = r0.f17313f
            int r9 = r8.length
            r10 = 0
        L5f:
            if (r10 >= r9) goto L74
            r11 = r8[r10]
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r12 = r11.m9295a(r1)
            if (r12 == 0) goto L71
            java.lang.String r13 = r12.f576Y
            r4.put(r13, r11)
            r14.add(r12)
        L71:
            int r10 = r10 + 1
            goto L5f
        L74:
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            r0.f17314g = r4
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            f4.u0 r4 = r1.mo2838f()
            r8 = 1
            if (r4 != 0) goto L88
            r4 = 0
            goto L89
        L88:
            r4 = 1
        L89:
            r9 = 2
            if (r4 == 0) goto L8e
            r4 = 7
            goto Lab
        L8e:
            int r4 = r1.mo2850n()
            boolean r10 = r1.mo2862u()
            if (r4 == r9) goto La5
            r11 = 3
            if (r4 == r11) goto La2
            r10 = 4
            if (r4 == r10) goto La0
            r11 = 0
            goto Laa
        La0:
            r11 = 1
            goto Laa
        La2:
            if (r10 == 0) goto La9
            goto Laa
        La5:
            if (r10 == 0) goto La9
            r11 = 6
            goto Laa
        La9:
            r11 = 2
        Laa:
            r4 = r11
        Lab:
            l4.a$h r10 = r0.f17318k
            if (r10 == 0) goto Lb4
            long r10 = r10.mo9305h(r1)
            goto Lb6
        Lb4:
            r10 = -1
        Lb6:
            r16 = r10
            f4.w0 r10 = r1.mo2837e()
            float r10 = r10.f9372Y
            java.lang.String r11 = "EXO_SPEED"
            r15.putFloat(r11, r10)
            boolean r11 = r1.mo5215B()
            if (r11 == 0) goto Lcb
            r12 = r10
            goto Lcd
        Lcb:
            r10 = 0
            r12 = 0
        Lcd:
            f4.j0 r10 = r1.mo5237w()
            if (r10 == 0) goto Le4
            java.lang.String r11 = r10.f8970Y
            java.lang.String r13 = ""
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto Le4
            java.lang.String r10 = r10.f8970Y
            java.lang.String r11 = "androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"
            r15.putString(r11, r10)
        Le4:
            l4.a$g r10 = r0.f17317j
            if (r10 != 0) goto Le9
            goto Lee
        Le9:
            long r2 = r10.mo9298f()
            long r2 = r2 & r6
        Lee:
            r6 = 5
            boolean r6 = r1.mo5217G(r6)
            r7 = 11
            boolean r7 = r1.mo5217G(r7)
            r10 = 12
            boolean r10 = r1.mo5217G(r10)
            f4.n1 r11 = r1.mo2829M()
            boolean r11 = r11.m5344r()
            if (r11 != 0) goto L10c
            r1.mo2840h()
        L10c:
            r18 = 6554119(0x640207, double:3.238165E-317)
            if (r6 == 0) goto L114
            r18 = 6554375(0x640307, double:3.2382915E-317)
        L114:
            if (r10 == 0) goto L11a
            r10 = 64
            long r18 = r18 | r10
        L11a:
            if (r7 == 0) goto L120
            r6 = 8
            long r18 = r18 | r6
        L120:
            long r6 = r0.f17319l
            long r6 = r6 & r18
            l4.a$h r10 = r0.f17318k
            if (r10 == 0) goto L131
            r18 = 4144(0x1030, double:2.0474E-320)
            long r10 = r10.mo9308m(r1)
            long r10 = r10 & r18
            long r6 = r6 | r10
        L131:
            long r18 = r2 | r6
            long r6 = r1.mo2861t()
            long r20 = r1.mo2834W()
            long r22 = android.os.SystemClock.elapsedRealtime()
            int r2 = r1.mo2821A()
            android.support.v4.media.session.MediaSessionCompat r3 = r0.f17308a
            if (r2 != r8) goto L149
            r5 = 1
            goto L14c
        L149:
            if (r2 != r9) goto L14c
            r5 = 2
        L14c:
            android.support.v4.media.session.MediaSessionCompat$b r2 = r3.f523a
            r2.mo344q(r5)
            android.support.v4.media.session.MediaSessionCompat r2 = r0.f17308a
            boolean r1 = r1.mo2831O()
            android.support.v4.media.session.MediaSessionCompat$b r2 = r2.f523a
            r2.mo328F(r1)
            android.support.v4.media.session.MediaSessionCompat r13 = r0.f17308a
            android.support.v4.media.session.PlaybackStateCompat r8 = new android.support.v4.media.session.PlaybackStateCompat
            r1 = r8
            r10 = 0
            r11 = 0
            r2 = r4
            r3 = r20
            r5 = r6
            r7 = r12
            r12 = r8
            r8 = r18
            r25 = r12
            r24 = r13
            r12 = r22
            r18 = r15
            r15 = r16
            r17 = r18
            r1.<init>(r2, r3, r5, r7, r8, r10, r11, r12, r14, r15, r17)
            r1 = r24
            android.support.v4.media.session.MediaSessionCompat$b r1 = r1.f523a
            r2 = r25
            goto L52
    }
}
