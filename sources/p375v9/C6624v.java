package p375v9;

/* renamed from: v9.v */
/* loaded from: classes.dex */
public class C6624v extends p375v9.AbstractC6590c implements java.lang.Cloneable {
    public static final android.os.Parcelable.Creator<p375v9.C6624v> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f25797Y;

    /* renamed from: Z */
    public java.lang.String f25798Z;

    /* renamed from: a0 */
    public boolean f25799a0;

    /* renamed from: b0 */
    public java.lang.String f25800b0;

    /* renamed from: c0 */
    public boolean f25801c0;

    /* renamed from: d0 */
    public java.lang.String f25802d0;

    /* renamed from: e0 */
    public java.lang.String f25803e0;

    static {
            v9.c0 r0 = new v9.c0
            r0.<init>()
            p375v9.C6624v.CREATOR = r0
            return
    }

    public C6624v(java.lang.String r4, java.lang.String r5, boolean r6, java.lang.String r7, boolean r8, java.lang.String r9, java.lang.String r10) {
            r3 = this;
            r0 = 0
            r3.<init>(r0)
            r1 = 1
            if (r6 == 0) goto L16
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L16
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 != 0) goto L14
            goto L16
        L14:
            r0 = 1
            goto L3d
        L16:
            if (r6 == 0) goto L24
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto L24
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L14
        L24:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L30
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L14
        L30:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L3d
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L3d
            goto L14
        L3d:
            java.lang.String r1 = "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID."
            com.google.android.gms.common.internal.C1101a.m3097b(r0, r1)
            r3.f25797Y = r4
            r3.f25798Z = r5
            r3.f25799a0 = r6
            r3.f25800b0 = r7
            r3.f25801c0 = r8
            r3.f25802d0 = r9
            r3.f25803e0 = r10
            return
    }

    /* renamed from: Y */
    public static p375v9.C6624v m13477Y(java.lang.String r9, java.lang.String r10) {
            v9.v r8 = new v9.v
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    /* renamed from: X */
    public final p375v9.C6624v m13478X() {
            r9 = this;
            v9.v r8 = new v9.v
            java.lang.String r1 = r9.f25797Y
            java.lang.String r2 = r9.f25798Z
            boolean r3 = r9.f25799a0
            java.lang.String r4 = r9.f25800b0
            boolean r5 = r9.f25801c0
            java.lang.String r6 = r9.f25802d0
            java.lang.String r7 = r9.f25803e0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            v9.v r0 = r1.m13478X()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 1
            java.lang.String r1 = r4.f25797Y
            r2 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r4.f25798Z
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 3
            boolean r1 = r4.f25799a0
            r3 = 4
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeInt(r1)
            java.lang.String r0 = r4.f25800b0
            p270p6.C5369c.m11719g(r5, r3, r0, r2)
            r0 = 5
            boolean r1 = r4.f25801c0
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeInt(r1)
            r0 = 6
            java.lang.String r1 = r4.f25802d0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 7
            java.lang.String r1 = r4.f25803e0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
