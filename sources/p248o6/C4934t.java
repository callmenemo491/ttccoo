package p248o6;

/* renamed from: o6.t */
/* loaded from: classes.dex */
public final class C4934t implements android.os.Parcelable.Creator<p248o6.C4930r> {
    public C4934t() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p248o6.C4930r createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = p270p6.C5368b.m11710t(r7)
            r1 = 0
            r2 = 0
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L2a
            int r3 = r7.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            r5 = 1
            if (r4 == r5) goto L25
            r5 = 2
            if (r4 == r5) goto L1e
            p270p6.C5368b.m11709s(r7, r3)
            goto L6
        L1e:
            android.os.Parcelable$Creator<o6.b0> r2 = p248o6.C4898b0.CREATOR
            java.util.ArrayList r2 = p270p6.C5368b.m11698h(r7, r3, r2)
            goto L6
        L25:
            int r1 = p270p6.C5368b.m11705o(r7, r3)
            goto L6
        L2a:
            p270p6.C5368b.m11699i(r7, r0)
            o6.r r7 = new o6.r
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p248o6.C4930r[] newArray(int r1) {
            r0 = this;
            o6.r[] r1 = new p248o6.C4930r[r1]
            return r1
    }
}
