package p036c6;

/* renamed from: c6.z0 */
/* loaded from: classes.dex */
public final class C0924z0 implements android.os.Parcelable.Creator<p036c6.C0911t> {
    public C0924z0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0911t createFromParcel(android.os.Parcel r8) {
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
            c6.t r8 = new c6.t
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0911t[] newArray(int r1) {
            r0 = this;
            c6.t[] r1 = new p036c6.C0911t[r1]
            return r1
    }
}
