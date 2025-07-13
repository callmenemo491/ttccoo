package p036c6;

/* renamed from: c6.j0 */
/* loaded from: classes.dex */
public final class C0892j0 implements android.os.Parcelable.Creator<com.google.android.gms.cast.MediaError> {
    public C0892j0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.cast.MediaError createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = p270p6.C5368b.m11710t(r12)
            r1 = 0
            r2 = 0
            r5 = r1
            r8 = r5
            r9 = r8
            r6 = r2
            r2 = r9
        Lc:
            int r3 = r12.dataPosition()
            if (r3 >= r0) goto L55
            int r3 = r12.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            r10 = 2
            if (r4 == r10) goto L50
            r10 = 3
            if (r4 == r10) goto L4b
            r10 = 4
            if (r4 == r10) goto L37
            r10 = 5
            if (r4 == r10) goto L32
            r10 = 6
            if (r4 == r10) goto L2d
            p270p6.C5368b.m11709s(r12, r3)
            goto Lc
        L2d:
            java.lang.String r2 = p270p6.C5368b.m11695e(r12, r3)
            goto Lc
        L32:
            java.lang.String r9 = p270p6.C5368b.m11695e(r12, r3)
            goto Lc
        L37:
            int r3 = p270p6.C5368b.m11708r(r12, r3)
            if (r3 != 0) goto L3f
            r8 = r1
            goto Lc
        L3f:
            p270p6.C5368b.m11712v(r12, r3, r10)
            int r3 = r12.readInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            goto Lc
        L4b:
            long r6 = p270p6.C5368b.m11706p(r12, r3)
            goto Lc
        L50:
            java.lang.String r5 = p270p6.C5368b.m11695e(r12, r3)
            goto Lc
        L55:
            p270p6.C5368b.m11699i(r12, r0)
            com.google.android.gms.cast.MediaError r12 = new com.google.android.gms.cast.MediaError
            org.json.JSONObject r10 = p123h6.C2487a.m6362a(r2)
            r4 = r12
            r4.<init>(r5, r6, r8, r9, r10)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.cast.MediaError[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.cast.MediaError[] r1 = new com.google.android.gms.cast.MediaError[r1]
            return r1
    }
}
