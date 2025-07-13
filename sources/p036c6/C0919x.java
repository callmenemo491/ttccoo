package p036c6;

/* renamed from: c6.x */
/* loaded from: classes.dex */
public final class C0919x implements android.os.Parcelable.Creator<p036c6.C0917w> {
    public C0919x() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0917w createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L31
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 2
            if (r5 == r6) goto L2c
            r6 = 3
            if (r5 == r6) goto L27
            r6 = 4
            if (r5 == r6) goto L22
            p270p6.C5368b.m11709s(r8, r4)
            goto L7
        L22:
            float r3 = p270p6.C5368b.m11703m(r8, r4)
            goto L7
        L27:
            float r2 = p270p6.C5368b.m11703m(r8, r4)
            goto L7
        L2c:
            float r1 = p270p6.C5368b.m11703m(r8, r4)
            goto L7
        L31:
            p270p6.C5368b.m11699i(r8, r0)
            c6.w r8 = new c6.w
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0917w[] newArray(int r1) {
            r0 = this;
            c6.w[] r1 = new p036c6.C0917w[r1]
            return r1
    }
}
