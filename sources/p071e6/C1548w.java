package p071e6;

/* renamed from: e6.w */
/* loaded from: classes.dex */
public final class C1548w implements android.os.Parcelable.Creator<p071e6.C1523b> {
    public C1548w() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p071e6.C1523b createFromParcel(android.os.Parcel r8) {
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
            int r3 = p270p6.C5368b.m11705o(r8, r4)
            goto L7
        L27:
            int r2 = p270p6.C5368b.m11705o(r8, r4)
            goto L7
        L2c:
            int r1 = p270p6.C5368b.m11705o(r8, r4)
            goto L7
        L31:
            p270p6.C5368b.m11699i(r8, r0)
            e6.b r8 = new e6.b
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p071e6.C1523b[] newArray(int r1) {
            r0 = this;
            e6.b[] r1 = new p071e6.C1523b[r1]
            return r1
    }
}
