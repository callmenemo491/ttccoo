package p287q7;

/* renamed from: q7.m */
/* loaded from: classes.dex */
public final class C5595m implements android.os.Parcelable.Creator<p287q7.C5593k> {
    public C5595m() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p287q7.C5593k createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = p270p6.C5368b.m11710t(r7)
            r1 = 0
            r2 = 0
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L2c
            int r3 = r7.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            r5 = 1
            if (r4 == r5) goto L27
            r5 = 2
            if (r4 == r5) goto L1e
            p270p6.C5368b.m11709s(r7, r3)
            goto L6
        L1e:
            android.os.Parcelable$Creator<o6.c0> r2 = p248o6.C4901c0.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r7, r3, r2)
            o6.c0 r2 = (p248o6.C4901c0) r2
            goto L6
        L27:
            int r1 = p270p6.C5368b.m11705o(r7, r3)
            goto L6
        L2c:
            p270p6.C5368b.m11699i(r7, r0)
            q7.k r7 = new q7.k
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p287q7.C5593k[] newArray(int r1) {
            r0 = this;
            q7.k[] r1 = new p287q7.C5593k[r1]
            return r1
    }
}
