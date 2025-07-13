package p249o7;

/* renamed from: o7.p */
/* loaded from: classes.dex */
public final class C5069p implements android.os.Parcelable.Creator<p249o7.C5061o> {
    public C5069p() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p249o7.C5061o createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r0 = p270p6.C5368b.m11710t(r6)
            r1 = 0
        L5:
            int r2 = r6.dataPosition()
            if (r2 >= r0) goto L1f
            int r2 = r6.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            r4 = 2
            if (r3 == r4) goto L1a
            p270p6.C5368b.m11709s(r6, r2)
            goto L5
        L1a:
            android.os.Bundle r1 = p270p6.C5368b.m11691a(r6, r2)
            goto L5
        L1f:
            p270p6.C5368b.m11699i(r6, r0)
            o7.o r6 = new o7.o
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p249o7.C5061o[] newArray(int r1) {
            r0 = this;
            o7.o[] r1 = new p249o7.C5061o[r1]
            return r1
    }
}
