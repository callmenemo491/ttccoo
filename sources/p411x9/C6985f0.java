package p411x9;

/* renamed from: x9.f0 */
/* loaded from: classes.dex */
public final class C6985f0 extends p375v9.AbstractC6614o {
    public static final android.os.Parcelable.Creator<p411x9.C6985f0> CREATOR = null;

    /* renamed from: Y */
    public p124h7.C2752me f27263Y;

    /* renamed from: Z */
    public p411x9.C6979c0 f27264Z;

    /* renamed from: a0 */
    public final java.lang.String f27265a0;

    /* renamed from: b0 */
    public java.lang.String f27266b0;

    /* renamed from: c0 */
    public java.util.List<p411x9.C6979c0> f27267c0;

    /* renamed from: d0 */
    public java.util.List<java.lang.String> f27268d0;

    /* renamed from: e0 */
    public java.lang.String f27269e0;

    /* renamed from: f0 */
    public java.lang.Boolean f27270f0;

    /* renamed from: g0 */
    public p411x9.C6989h0 f27271g0;

    /* renamed from: h0 */
    public boolean f27272h0;

    /* renamed from: i0 */
    public p375v9.C6605j0 f27273i0;

    /* renamed from: j0 */
    public p411x9.C6995n f27274j0;

    static {
            x9.g0 r0 = new x9.g0
            r0.<init>()
            p411x9.C6985f0.CREATOR = r0
            return
    }

    public C6985f0(p124h7.C2752me r1, p411x9.C6979c0 r2, java.lang.String r3, java.lang.String r4, java.util.List<p411x9.C6979c0> r5, java.util.List<java.lang.String> r6, java.lang.String r7, java.lang.Boolean r8, p411x9.C6989h0 r9, boolean r10, p375v9.C6605j0 r11, p411x9.C6995n r12) {
            r0 = this;
            r0.<init>()
            r0.f27263Y = r1
            r0.f27264Z = r2
            r0.f27265a0 = r3
            r0.f27266b0 = r4
            r0.f27267c0 = r5
            r0.f27268d0 = r6
            r0.f27269e0 = r7
            r0.f27270f0 = r8
            r0.f27271g0 = r9
            r0.f27272h0 = r10
            r0.f27273i0 = r11
            r0.f27274j0 = r12
            return
    }

    public C6985f0(p251o9.C5180d r1, java.util.List<? extends p375v9.InterfaceC6628z> r2) {
            r0 = this;
            r0.<init>()
            r1.m11497a()
            java.lang.String r1 = r1.f20313b
            r0.f27265a0 = r1
            java.lang.String r1 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            r0.f27266b0 = r1
            java.lang.String r1 = "2"
            r0.f27269e0 = r1
            r0.mo13469e0(r2)
            return
    }

    @Override // p375v9.InterfaceC6628z
    /* renamed from: T */
    public final java.lang.String mo13479T() {
            r1 = this;
            x9.c0 r0 = r1.f27264Z
            java.lang.String r0 = r0.f27250Z
            return r0
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: X */
    public final /* bridge */ /* synthetic */ p411x9.C6980d mo13462X() {
            r1 = this;
            x9.d r0 = new x9.d
            r0.<init>(r1)
            return r0
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: Y */
    public final java.util.List<? extends p375v9.InterfaceC6628z> mo13463Y() {
            r1 = this;
            java.util.List<x9.c0> r0 = r1.f27267c0
            return r0
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: Z */
    public final java.lang.String mo13464Z() {
            r3 = this;
            h7.me r0 = r3.f27263Y
            r1 = 0
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.f11773Z
            if (r0 == 0) goto L22
            v9.p r0 = p411x9.C6993l.m14141a(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f25792b
            java.lang.String r2 = "firebase"
            java.lang.Object r0 = r0.get(r2)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L22
            java.lang.String r1 = "tenant"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L22:
            return r1
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: a0 */
    public final java.lang.String mo13465a0() {
            r1 = this;
            x9.c0 r0 = r1.f27264Z
            java.lang.String r0 = r0.f27249Y
            return r0
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: b0 */
    public final boolean mo13466b0() {
            r4 = this;
            java.lang.Boolean r0 = r4.f27270f0
            if (r0 == 0) goto La
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
        La:
            h7.me r0 = r4.f27263Y
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.f11773Z
            v9.p r0 = p411x9.C6993l.m14141a(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f25792b
            java.lang.String r1 = "firebase"
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L29
            java.lang.String r1 = "sign_in_provider"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L2d
        L29:
            r0 = 0
            goto L2d
        L2b:
            java.lang.String r0 = ""
        L2d:
            java.util.List<x9.c0> r1 = r4.f27267c0
            int r1 = r1.size()
            r2 = 0
            r3 = 1
            if (r1 > r3) goto L42
            if (r0 == 0) goto L41
            java.lang.String r1 = "custom"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
        L41:
            r2 = 1
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.f27270f0 = r0
        L48:
            java.lang.Boolean r0 = r4.f27270f0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: c0 */
    public final p251o9.C5180d mo13467c0() {
            r1 = this;
            java.lang.String r0 = r1.f27265a0
            o9.d r0 = p251o9.C5180d.m11495d(r0)
            return r0
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: d0 */
    public final p375v9.AbstractC6614o mo13468d0() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.f27270f0 = r0
            return r1
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: e0 */
    public final p375v9.AbstractC6614o mo13469e0(java.util.List<? extends p375v9.InterfaceC6628z> r6) {
            r5 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r5.f27267c0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r5.f27268d0 = r0
            r0 = 0
            r1 = 0
        L1d:
            int r2 = r6.size()
            if (r1 >= r2) goto L4e
            java.lang.Object r2 = r6.get(r1)
            v9.z r2 = (p375v9.InterfaceC6628z) r2
            java.lang.String r3 = r2.mo13479T()
            java.lang.String r4 = "firebase"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L3b
            r3 = r2
            x9.c0 r3 = (p411x9.C6979c0) r3
            r5.f27264Z = r3
            goto L44
        L3b:
            java.util.List<java.lang.String> r3 = r5.f27268d0
            java.lang.String r4 = r2.mo13479T()
            r3.add(r4)
        L44:
            java.util.List<x9.c0> r3 = r5.f27267c0
            x9.c0 r2 = (p411x9.C6979c0) r2
            r3.add(r2)
            int r1 = r1 + 1
            goto L1d
        L4e:
            x9.c0 r6 = r5.f27264Z
            if (r6 != 0) goto L5c
            java.util.List<x9.c0> r6 = r5.f27267c0
            java.lang.Object r6 = r6.get(r0)
            x9.c0 r6 = (p411x9.C6979c0) r6
            r5.f27264Z = r6
        L5c:
            return r5
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: f0 */
    public final p124h7.C2752me mo13470f0() {
            r1 = this;
            h7.me r0 = r1.f27263Y
            return r0
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: g0 */
    public final java.lang.String mo13471g0() {
            r1 = this;
            h7.me r0 = r1.f27263Y
            java.lang.String r0 = r0.f11773Z
            return r0
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: h0 */
    public final java.lang.String mo13472h0() {
            r1 = this;
            h7.me r0 = r1.f27263Y
            java.lang.String r0 = r0.m6986Y()
            return r0
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: i0 */
    public final java.util.List<java.lang.String> mo13473i0() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.f27268d0
            return r0
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: j0 */
    public final void mo13474j0(p124h7.C2752me r1) {
            r0 = this;
            r0.f27263Y = r1
            return
    }

    @Override // p375v9.AbstractC6614o
    /* renamed from: k0 */
    public final void mo13475k0(java.util.List<p375v9.AbstractC6621s> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L8
            r4 = 0
            goto L2c
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r4.next()
            v9.s r1 = (p375v9.AbstractC6621s) r1
            boolean r2 = r1 instanceof p375v9.C6625w
            if (r2 == 0) goto L11
            v9.w r1 = (p375v9.C6625w) r1
            r0.add(r1)
            goto L11
        L27:
            x9.n r4 = new x9.n
            r4.<init>(r0)
        L2c:
            r3.f27274j0 = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 1
            h7.me r2 = r5.f27263Y
            r3 = 0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r3)
            r1 = 2
            x9.c0 r2 = r5.f27264Z
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r3)
            r1 = 3
            java.lang.String r2 = r5.f27265a0
            p270p6.C5369c.m11719g(r6, r1, r2, r3)
            java.lang.String r1 = r5.f27266b0
            r2 = 4
            p270p6.C5369c.m11719g(r6, r2, r1, r3)
            r1 = 5
            java.util.List<x9.c0> r4 = r5.f27267c0
            p270p6.C5369c.m11722j(r6, r1, r4, r3)
            r1 = 6
            java.util.List<java.lang.String> r4 = r5.f27268d0
            p270p6.C5369c.m11720h(r6, r1, r4, r3)
            r1 = 7
            java.lang.String r4 = r5.f27269e0
            p270p6.C5369c.m11719g(r6, r1, r4, r3)
            r1 = 8
            boolean r4 = r5.mo13466b0()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            p270p6.C5369c.m11713a(r6, r1, r4, r3)
            r1 = 9
            x9.h0 r4 = r5.f27271g0
            p270p6.C5369c.m11718f(r6, r1, r4, r7, r3)
            r1 = 10
            boolean r4 = r5.f27272h0
            p270p6.C5369c.m11724l(r6, r1, r2)
            r6.writeInt(r4)
            r1 = 11
            v9.j0 r2 = r5.f27273i0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r3)
            r1 = 12
            x9.n r2 = r5.f27274j0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r3)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
