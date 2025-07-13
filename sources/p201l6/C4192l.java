package p201l6;

/* renamed from: l6.l */
/* loaded from: classes.dex */
public final class C4192l implements android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> {
    public C4192l() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.common.api.Status createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = p270p6.C5368b.m11710t(r10)
            r1 = 0
            r2 = 0
            r6 = r2
            r7 = r6
            r8 = r7
            r4 = 0
            r5 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L50
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L4b
            r3 = 2
            if (r2 == r3) goto L46
            r3 = 3
            if (r2 == r3) goto L3c
            r3 = 4
            if (r2 == r3) goto L32
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L2d
            p270p6.C5368b.m11709s(r10, r1)
            goto Lb
        L2d:
            int r4 = p270p6.C5368b.m11705o(r10, r1)
            goto Lb
        L32:
            android.os.Parcelable$Creator<k6.b> r2 = p184k6.C3698b.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r10, r1, r2)
            r8 = r1
            k6.b r8 = (p184k6.C3698b) r8
            goto Lb
        L3c:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r10, r1, r2)
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            goto Lb
        L46:
            java.lang.String r6 = p270p6.C5368b.m11695e(r10, r1)
            goto Lb
        L4b:
            int r5 = p270p6.C5368b.m11705o(r10, r1)
            goto Lb
        L50:
            p270p6.C5368b.m11699i(r10, r0)
            com.google.android.gms.common.api.Status r10 = new com.google.android.gms.common.api.Status
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.api.Status[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.api.Status[] r1 = new com.google.android.gms.common.api.Status[r1]
            return r1
    }
}
