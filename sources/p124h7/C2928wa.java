package p124h7;

/* renamed from: h7.wa */
/* loaded from: classes.dex */
public final class C2928wa implements android.os.Parcelable.Creator<p124h7.C2910va> {
    public C2928wa() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2910va createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = p270p6.C5368b.m11710t(r9)
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L42
            int r5 = r9.readInt()
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r7 = 1
            if (r6 == r7) goto L39
            r7 = 2
            if (r6 == r7) goto L30
            r7 = 3
            if (r6 == r7) goto L2b
            r7 = 4
            if (r6 == r7) goto L26
            p270p6.C5368b.m11709s(r9, r5)
            goto L8
        L26:
            java.lang.String r4 = p270p6.C5368b.m11695e(r9, r5)
            goto L8
        L2b:
            java.lang.String r3 = p270p6.C5368b.m11695e(r9, r5)
            goto L8
        L30:
            android.os.Parcelable$Creator<v9.j0> r2 = p375v9.C6605j0.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r9, r5, r2)
            v9.j0 r2 = (p375v9.C6605j0) r2
            goto L8
        L39:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r9, r5, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            goto L8
        L42:
            p270p6.C5368b.m11699i(r9, r0)
            h7.va r9 = new h7.va
            r9.<init>(r1, r2, r3, r4)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2910va[] newArray(int r1) {
            r0 = this;
            h7.va[] r1 = new p124h7.C2910va[r1]
            return r1
    }
}
