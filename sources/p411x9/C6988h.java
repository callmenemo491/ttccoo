package p411x9;

/* renamed from: x9.h */
/* loaded from: classes.dex */
public final class C6988h implements android.os.Parcelable.Creator<p411x9.C6986g> {
    public C6988h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p411x9.C6986g createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L33
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 1
            if (r5 == r6) goto L2e
            r6 = 2
            if (r5 == r6) goto L29
            r6 = 3
            if (r5 == r6) goto L22
            p270p6.C5368b.m11709s(r8, r4)
            goto L7
        L22:
            android.os.Parcelable$Creator<v9.w> r3 = p375v9.C6625w.CREATOR
            java.util.ArrayList r3 = p270p6.C5368b.m11698h(r8, r4, r3)
            goto L7
        L29:
            java.lang.String r2 = p270p6.C5368b.m11695e(r8, r4)
            goto L7
        L2e:
            java.lang.String r1 = p270p6.C5368b.m11695e(r8, r4)
            goto L7
        L33:
            p270p6.C5368b.m11699i(r8, r0)
            x9.g r8 = new x9.g
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p411x9.C6986g[] newArray(int r1) {
            r0 = this;
            x9.g[] r1 = new p411x9.C6986g[r1]
            return r1
    }
}
