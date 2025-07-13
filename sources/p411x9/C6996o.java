package p411x9;

/* renamed from: x9.o */
/* loaded from: classes.dex */
public final class C6996o implements android.os.Parcelable.Creator<p411x9.C6995n> {
    public C6996o() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p411x9.C6995n createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r0 = p270p6.C5368b.m11710t(r6)
            r1 = 0
        L5:
            int r2 = r6.dataPosition()
            if (r2 >= r0) goto L21
            int r2 = r6.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            r4 = 1
            if (r3 == r4) goto L1a
            p270p6.C5368b.m11709s(r6, r2)
            goto L5
        L1a:
            android.os.Parcelable$Creator<v9.w> r1 = p375v9.C6625w.CREATOR
            java.util.ArrayList r1 = p270p6.C5368b.m11698h(r6, r2, r1)
            goto L5
        L21:
            p270p6.C5368b.m11699i(r6, r0)
            x9.n r6 = new x9.n
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p411x9.C6995n[] newArray(int r1) {
            r0 = this;
            x9.n[] r1 = new p411x9.C6995n[r1]
            return r1
    }
}
