package p375v9;

/* renamed from: v9.j0 */
/* loaded from: classes.dex */
public final class C6605j0 extends p375v9.AbstractC6623u {
    public static final android.os.Parcelable.Creator<p375v9.C6605j0> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f25781Y;

    /* renamed from: Z */
    public final java.lang.String f25782Z;

    /* renamed from: a0 */
    public final java.lang.String f25783a0;

    /* renamed from: b0 */
    public final p124h7.C2681if f25784b0;

    /* renamed from: c0 */
    public final java.lang.String f25785c0;

    /* renamed from: d0 */
    public final java.lang.String f25786d0;

    /* renamed from: e0 */
    public final java.lang.String f25787e0;

    static {
            v9.k0 r0 = new v9.k0
            r0.<init>()
            p375v9.C6605j0.CREATOR = r0
            return
    }

    public C6605j0(java.lang.String r2, java.lang.String r3, java.lang.String r4, p124h7.C2681if r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r1 = this;
            r1.<init>()
            int r0 = p124h7.C2896ue.f11946a
            if (r2 != 0) goto L9
            java.lang.String r2 = ""
        L9:
            r1.f25781Y = r2
            r1.f25782Z = r3
            r1.f25783a0 = r4
            r1.f25784b0 = r5
            r1.f25785c0 = r6
            r1.f25786d0 = r7
            r1.f25787e0 = r8
            return
    }

    /* renamed from: Y */
    public static p375v9.C6605j0 m13458Y(p124h7.C2681if r9) {
            java.lang.String r0 = "Must specify a non-null webSignInCredential"
            com.google.android.gms.common.internal.C1101a.m3104i(r9, r0)
            v9.j0 r0 = new v9.j0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r0
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    /* renamed from: X */
    public final p375v9.AbstractC6590c m13459X() {
            r9 = this;
            v9.j0 r8 = new v9.j0
            java.lang.String r1 = r9.f25781Y
            java.lang.String r2 = r9.f25782Z
            java.lang.String r3 = r9.f25783a0
            h7.if r4 = r9.f25784b0
            java.lang.String r5 = r9.f25785c0
            java.lang.String r6 = r9.f25786d0
            java.lang.String r7 = r9.f25787e0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            java.lang.String r2 = r4.f25781Y
            r3 = 0
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 2
            java.lang.String r2 = r4.f25782Z
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 3
            java.lang.String r2 = r4.f25783a0
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 4
            h7.if r2 = r4.f25784b0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r6 = 5
            java.lang.String r1 = r4.f25785c0
            p270p6.C5369c.m11719g(r5, r6, r1, r3)
            r6 = 6
            java.lang.String r1 = r4.f25786d0
            p270p6.C5369c.m11719g(r5, r6, r1, r3)
            r6 = 7
            java.lang.String r1 = r4.f25787e0
            p270p6.C5369c.m11719g(r5, r6, r1, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
