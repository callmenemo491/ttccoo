package p164j6;

/* renamed from: j6.e */
/* loaded from: classes.dex */
public final class C3431e implements android.os.Parcelable.Creator<p164j6.C3427a> {
    public C3431e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p164j6.C3427a createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r0 = p270p6.C5368b.m11710t(r6)
            r1 = 0
        L5:
            int r2 = r6.dataPosition()
            if (r2 >= r0) goto L23
            int r2 = r6.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            r4 = 1
            if (r3 == r4) goto L1a
            p270p6.C5368b.m11709s(r6, r2)
            goto L5
        L1a:
            android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r6, r2, r1)
            android.content.Intent r1 = (android.content.Intent) r1
            goto L5
        L23:
            p270p6.C5368b.m11699i(r6, r0)
            j6.a r6 = new j6.a
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p164j6.C3427a[] newArray(int r1) {
            r0 = this;
            j6.a[] r1 = new p164j6.C3427a[r1]
            return r1
    }
}
