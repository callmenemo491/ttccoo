package p375v9;

/* renamed from: v9.r */
/* loaded from: classes.dex */
public class C6620r extends p375v9.AbstractC6590c {
    public static final android.os.Parcelable.Creator<p375v9.C6620r> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f25795Y;

    /* renamed from: Z */
    public final java.lang.String f25796Z;

    static {
            v9.b0 r0 = new v9.b0
            r0.<init>()
            p375v9.C6620r.CREATOR = r0
            return
    }

    public C6620r(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            if (r2 != 0) goto L11
            if (r3 == 0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Must specify an idToken or an accessToken."
            r2.<init>(r3)
            throw r2
        L11:
            if (r2 == 0) goto L22
            int r0 = r2.length()
            if (r0 == 0) goto L1a
            goto L22
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "idToken cannot be empty"
            r2.<init>(r3)
            throw r2
        L22:
            if (r3 == 0) goto L33
            int r0 = r3.length()
            if (r0 == 0) goto L2b
            goto L33
        L2b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "accessToken cannot be empty"
            r2.<init>(r3)
            throw r2
        L33:
            r1.f25795Y = r2
            r1.f25796Z = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f25795Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f25796Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
