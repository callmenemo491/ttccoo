package p071e6;

/* renamed from: e6.e0 */
/* loaded from: classes.dex */
public final class C1530e0 implements android.os.Parcelable.Creator<p071e6.C1527d> {
    public C1530e0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p071e6.C1527d createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = 0
            r2 = r1
            r3 = 0
        L8:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L32
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 2
            if (r5 == r6) goto L2d
            r6 = 3
            if (r5 == r6) goto L28
            r6 = 4
            if (r5 == r6) goto L23
            p270p6.C5368b.m11709s(r8, r4)
            goto L8
        L23:
            java.lang.String r2 = p270p6.C5368b.m11695e(r8, r4)
            goto L8
        L28:
            int r3 = p270p6.C5368b.m11705o(r8, r4)
            goto L8
        L2d:
            java.lang.String r1 = p270p6.C5368b.m11695e(r8, r4)
            goto L8
        L32:
            p270p6.C5368b.m11699i(r8, r0)
            e6.d r8 = new e6.d
            r8.<init>(r1, r3, r2)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p071e6.C1527d[] newArray(int r1) {
            r0 = this;
            e6.d[] r1 = new p071e6.C1527d[r1]
            return r1
    }
}
