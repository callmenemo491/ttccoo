package p201l6;

/* renamed from: l6.k */
/* loaded from: classes.dex */
public final class C4191k implements android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> {
    public C4191k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.common.api.Scope createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = p270p6.C5368b.m11710t(r7)
            r1 = 0
            r2 = 0
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L28
            int r3 = r7.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            r5 = 1
            if (r4 == r5) goto L23
            r5 = 2
            if (r4 == r5) goto L1e
            p270p6.C5368b.m11709s(r7, r3)
            goto L6
        L1e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r7, r3)
            goto L6
        L23:
            int r1 = p270p6.C5368b.m11705o(r7, r3)
            goto L6
        L28:
            p270p6.C5368b.m11699i(r7, r0)
            com.google.android.gms.common.api.Scope r7 = new com.google.android.gms.common.api.Scope
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.api.Scope[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.api.Scope[] r1 = new com.google.android.gms.common.api.Scope[r1]
            return r1
    }
}
