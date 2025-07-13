package p287q7;

/* renamed from: q7.n */
/* loaded from: classes.dex */
public final class C5596n implements android.os.Parcelable.Creator<p287q7.C5594l> {
    public C5596n() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p287q7.C5594l createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = 0
            r2 = r1
            r3 = 0
        L8:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L3a
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 1
            if (r5 == r6) goto L35
            r6 = 2
            if (r5 == r6) goto L2c
            r6 = 3
            if (r5 == r6) goto L23
            p270p6.C5368b.m11709s(r8, r4)
            goto L8
        L23:
            android.os.Parcelable$Creator<o6.d0> r2 = p248o6.C4903d0.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r8, r4, r2)
            o6.d0 r2 = (p248o6.C4903d0) r2
            goto L8
        L2c:
            android.os.Parcelable$Creator<k6.b> r1 = p184k6.C3698b.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r8, r4, r1)
            k6.b r1 = (p184k6.C3698b) r1
            goto L8
        L35:
            int r3 = p270p6.C5368b.m11705o(r8, r4)
            goto L8
        L3a:
            p270p6.C5368b.m11699i(r8, r0)
            q7.l r8 = new q7.l
            r8.<init>(r3, r1, r2)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p287q7.C5594l[] newArray(int r1) {
            r0 = this;
            q7.l[] r1 = new p287q7.C5594l[r1]
            return r1
    }
}
