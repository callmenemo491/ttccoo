package p248o6;

/* renamed from: o6.e0 */
/* loaded from: classes.dex */
public final class C4905e0 implements android.os.Parcelable.Creator<p248o6.C4901c0> {
    public C4905e0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p248o6.C4901c0 createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = p270p6.C5368b.m11710t(r9)
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = r3
            r2 = 0
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L43
            int r5 = r9.readInt()
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r7 = 1
            if (r6 == r7) goto L3e
            r7 = 2
            if (r6 == r7) goto L35
            r7 = 3
            if (r6 == r7) goto L30
            r7 = 4
            if (r6 == r7) goto L27
            p270p6.C5368b.m11709s(r9, r5)
            goto L9
        L27:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r4 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r4 = p270p6.C5368b.m11694d(r9, r5, r4)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r4
            goto L9
        L30:
            int r2 = p270p6.C5368b.m11705o(r9, r5)
            goto L9
        L35:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r3 = p270p6.C5368b.m11694d(r9, r5, r3)
            android.accounts.Account r3 = (android.accounts.Account) r3
            goto L9
        L3e:
            int r1 = p270p6.C5368b.m11705o(r9, r5)
            goto L9
        L43:
            p270p6.C5368b.m11699i(r9, r0)
            o6.c0 r9 = new o6.c0
            r9.<init>(r1, r3, r2, r4)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p248o6.C4901c0[] newArray(int r1) {
            r0 = this;
            o6.c0[] r1 = new p248o6.C4901c0[r1]
            return r1
    }
}
