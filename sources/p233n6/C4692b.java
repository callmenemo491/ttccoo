package p233n6;

/* renamed from: n6.b */
/* loaded from: classes.dex */
public final class C4692b implements android.os.Parcelable.Creator<p233n6.C4691a> {
    public C4692b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p233n6.C4691a createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = p270p6.C5368b.m11710t(r9)
            r1 = 0
            r2 = 0
            r4 = r2
            r2 = 0
            r3 = 0
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L3f
            int r5 = r9.readInt()
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r7 = 1
            if (r6 == r7) goto L3a
            r7 = 2
            if (r6 == r7) goto L31
            r7 = 3
            if (r6 == r7) goto L2c
            r7 = 4
            if (r6 == r7) goto L27
            p270p6.C5368b.m11709s(r9, r5)
            goto L9
        L27:
            int r3 = p270p6.C5368b.m11705o(r9, r5)
            goto L9
        L2c:
            int r2 = p270p6.C5368b.m11705o(r9, r5)
            goto L9
        L31:
            android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
            android.os.Parcelable r4 = p270p6.C5368b.m11694d(r9, r5, r4)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L9
        L3a:
            int r1 = p270p6.C5368b.m11705o(r9, r5)
            goto L9
        L3f:
            p270p6.C5368b.m11699i(r9, r0)
            n6.a r9 = new n6.a
            r9.<init>(r1, r4, r2, r3)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p233n6.C4691a[] newArray(int r1) {
            r0 = this;
            n6.a[] r1 = new p233n6.C4691a[r1]
            return r1
    }
}
