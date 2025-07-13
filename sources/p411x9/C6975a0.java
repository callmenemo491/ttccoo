package p411x9;

/* renamed from: x9.a0 */
/* loaded from: classes.dex */
public final class C6975a0 implements p375v9.InterfaceC6592d {
    public static final android.os.Parcelable.Creator<p411x9.C6975a0> CREATOR = null;

    /* renamed from: Y */
    public p411x9.C6985f0 f27246Y;

    /* renamed from: Z */
    public p411x9.C7006y f27247Z;

    /* renamed from: a0 */
    public p375v9.C6605j0 f27248a0;

    static {
            x9.b0 r0 = new x9.b0
            r0.<init>()
            p411x9.C6975a0.CREATOR = r0
            return
    }

    public C6975a0(p411x9.C6985f0 r7) {
            r6 = this;
            r6.<init>()
            r6.f27246Y = r7
            java.util.List<x9.c0> r0 = r7.f27267c0
            r1 = 0
            r6.f27247Z = r1
            r1 = 0
        Lb:
            int r2 = r0.size()
            if (r1 >= r2) goto L3b
            java.lang.Object r2 = r0.get(r1)
            x9.c0 r2 = (p411x9.C6979c0) r2
            java.lang.String r2 = r2.f27256f0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L38
            x9.y r2 = new x9.y
            java.lang.Object r3 = r0.get(r1)
            x9.c0 r3 = (p411x9.C6979c0) r3
            java.lang.String r3 = r3.f27250Z
            java.lang.Object r4 = r0.get(r1)
            x9.c0 r4 = (p411x9.C6979c0) r4
            java.lang.String r4 = r4.f27256f0
            boolean r5 = r7.f27272h0
            r2.<init>(r3, r4, r5)
            r6.f27247Z = r2
        L38:
            int r1 = r1 + 1
            goto Lb
        L3b:
            x9.y r0 = r6.f27247Z
            if (r0 != 0) goto L48
            x9.y r0 = new x9.y
            boolean r1 = r7.f27272h0
            r0.<init>(r1)
            r6.f27247Z = r0
        L48:
            v9.j0 r7 = r7.f27273i0
            r6.f27248a0 = r7
            return
    }

    public C6975a0(p411x9.C6985f0 r1, p411x9.C7006y r2, p375v9.C6605j0 r3) {
            r0 = this;
            r0.<init>()
            r0.f27246Y = r1
            r0.f27247Z = r2
            r0.f27248a0 = r3
            return
    }

    @Override // p375v9.InterfaceC6592d
    /* renamed from: H */
    public final p375v9.AbstractC6614o mo13457H() {
            r1 = this;
            x9.f0 r0 = r1.f27246Y
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            x9.f0 r2 = r4.f27246Y
            r3 = 0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r1 = 2
            x9.y r2 = r4.f27247Z
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r1 = 3
            v9.j0 r2 = r4.f27248a0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
