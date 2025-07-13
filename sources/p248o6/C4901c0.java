package p248o6;

/* renamed from: o6.c0 */
/* loaded from: classes.dex */
public final class C4901c0 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p248o6.C4901c0> CREATOR = null;

    /* renamed from: Y */
    public final int f19454Y;

    /* renamed from: Z */
    public final android.accounts.Account f19455Z;

    /* renamed from: a0 */
    public final int f19456a0;

    /* renamed from: b0 */
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount f19457b0;

    static {
            o6.e0 r0 = new o6.e0
            r0.<init>()
            p248o6.C4901c0.CREATOR = r0
            return
    }

    public C4901c0(int r1, android.accounts.Account r2, int r3, com.google.android.gms.auth.api.signin.GoogleSignInAccount r4) {
            r0 = this;
            r0.<init>()
            r0.f19454Y = r1
            r0.f19455Z = r2
            r0.f19456a0 = r3
            r0.f19457b0 = r4
            return
    }

    public C4901c0(android.accounts.Account r2, int r3, com.google.android.gms.auth.api.signin.GoogleSignInAccount r4) {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.f19454Y = r0
            r1.f19455Z = r2
            r1.f19456a0 = r3
            r1.f19457b0 = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 1
            int r2 = r5.f19454Y
            r3 = 4
            p270p6.C5369c.m11724l(r6, r1, r3)
            r6.writeInt(r2)
            r1 = 2
            android.accounts.Account r2 = r5.f19455Z
            r4 = 0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r4)
            r1 = 3
            int r2 = r5.f19456a0
            p270p6.C5369c.m11724l(r6, r1, r3)
            r6.writeInt(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r5.f19457b0
            p270p6.C5369c.m11718f(r6, r3, r1, r7, r4)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
