package p411x9;

/* renamed from: x9.c */
/* loaded from: classes.dex */
public final class C6978c implements android.os.Parcelable.Creator<p411x9.C6989h0> {
    public C6978c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p411x9.C6989h0 createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = p270p6.C5368b.m11710t(r9)
            r1 = 0
            r3 = r1
        L7:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L29
            int r5 = r9.readInt()
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r7 = 1
            if (r6 == r7) goto L24
            r7 = 2
            if (r6 == r7) goto L1f
            p270p6.C5368b.m11709s(r9, r5)
            goto L7
        L1f:
            long r3 = p270p6.C5368b.m11706p(r9, r5)
            goto L7
        L24:
            long r1 = p270p6.C5368b.m11706p(r9, r5)
            goto L7
        L29:
            p270p6.C5368b.m11699i(r9, r0)
            x9.h0 r9 = new x9.h0
            r9.<init>(r1, r3)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p411x9.C6989h0[] newArray(int r1) {
            r0 = this;
            x9.h0[] r1 = new p411x9.C6989h0[r1]
            return r1
    }
}
