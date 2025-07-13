package p184k6;

/* renamed from: k6.k */
/* loaded from: classes.dex */
public final class C3708k implements android.os.Parcelable.Creator<p184k6.C3698b> {
    public C3708k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p184k6.C3698b createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = p270p6.C5368b.m11710t(r9)
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = r3
            r2 = 0
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L3f
            int r5 = r9.readInt()
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r7 = 1
            if (r6 == r7) goto L3a
            r7 = 2
            if (r6 == r7) goto L35
            r7 = 3
            if (r6 == r7) goto L2c
            r7 = 4
            if (r6 == r7) goto L27
            p270p6.C5368b.m11709s(r9, r5)
            goto L9
        L27:
            java.lang.String r4 = p270p6.C5368b.m11695e(r9, r5)
            goto L9
        L2c:
            android.os.Parcelable$Creator r3 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r3 = p270p6.C5368b.m11694d(r9, r5, r3)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            goto L9
        L35:
            int r2 = p270p6.C5368b.m11705o(r9, r5)
            goto L9
        L3a:
            int r1 = p270p6.C5368b.m11705o(r9, r5)
            goto L9
        L3f:
            p270p6.C5368b.m11699i(r9, r0)
            k6.b r9 = new k6.b
            r9.<init>(r1, r2, r3, r4)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p184k6.C3698b[] newArray(int r1) {
            r0 = this;
            k6.b[] r1 = new p184k6.C3698b[r1]
            return r1
    }
}
