package p124h7;

/* renamed from: h7.hf */
/* loaded from: classes.dex */
public final class C2663hf implements android.os.Parcelable.Creator<p124h7.C2645gf> {
    public C2663hf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2645gf createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = p270p6.C5368b.m11710t(r7)
            r1 = 0
            r2 = 0
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L28
            int r3 = r7.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            r5 = 1
            if (r4 == r5) goto L23
            r5 = 2
            if (r4 == r5) goto L1e
            p270p6.C5368b.m11709s(r7, r3)
            goto L6
        L1e:
            java.util.ArrayList r2 = p270p6.C5368b.m11696f(r7, r3)
            goto L6
        L23:
            int r1 = p270p6.C5368b.m11705o(r7, r3)
            goto L6
        L28:
            p270p6.C5368b.m11699i(r7, r0)
            h7.gf r7 = new h7.gf
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2645gf[] newArray(int r1) {
            r0 = this;
            h7.gf[] r1 = new p124h7.C2645gf[r1]
            return r1
    }
}
