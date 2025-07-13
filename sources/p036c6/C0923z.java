package p036c6;

/* renamed from: c6.z */
/* loaded from: classes.dex */
public final class C0923z implements android.os.Parcelable.Creator<p036c6.C0921y> {
    public C0923z() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0921y createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = p270p6.C5368b.m11710t(r7)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L30
            int r3 = r7.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            r5 = 2
            if (r4 == r5) goto L27
            r5 = 3
            if (r4 == r5) goto L1e
            p270p6.C5368b.m11709s(r7, r3)
            goto L6
        L1e:
            android.os.Parcelable$Creator<c6.w> r2 = p036c6.C0917w.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r7, r3, r2)
            c6.w r2 = (p036c6.C0917w) r2
            goto L6
        L27:
            android.os.Parcelable$Creator<c6.w> r1 = p036c6.C0917w.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r7, r3, r1)
            c6.w r1 = (p036c6.C0917w) r1
            goto L6
        L30:
            p270p6.C5368b.m11699i(r7, r0)
            c6.y r7 = new c6.y
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0921y[] newArray(int r1) {
            r0 = this;
            c6.y[] r1 = new p036c6.C0921y[r1]
            return r1
    }
}
