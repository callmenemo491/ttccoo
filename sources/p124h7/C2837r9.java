package p124h7;

/* renamed from: h7.r9 */
/* loaded from: classes.dex */
public final class C2837r9 implements android.os.Parcelable.Creator<p124h7.C2819q9> {
    public C2837r9() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2819q9 createFromParcel(android.os.Parcel r6) {
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
            android.os.Parcelable$Creator<h7.xe> r1 = p124h7.C2950xe.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r6, r2, r1)
            h7.xe r1 = (p124h7.C2950xe) r1
            goto L5
        L23:
            p270p6.C5368b.m11699i(r6, r0)
            h7.q9 r6 = new h7.q9
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2819q9[] newArray(int r1) {
            r0 = this;
            h7.q9[] r1 = new p124h7.C2819q9[r1]
            return r1
    }
}
