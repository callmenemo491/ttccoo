package p184k6;

/* renamed from: k6.x */
/* loaded from: classes.dex */
public final class C3721x implements android.os.Parcelable.Creator<p184k6.C3719v> {
    public C3721x() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p184k6.C3719v createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = 0
        L8:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L32
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 1
            if (r5 == r6) goto L2d
            r6 = 2
            if (r5 == r6) goto L28
            r6 = 3
            if (r5 == r6) goto L23
            p270p6.C5368b.m11709s(r8, r4)
            goto L8
        L23:
            int r2 = p270p6.C5368b.m11705o(r8, r4)
            goto L8
        L28:
            java.lang.String r3 = p270p6.C5368b.m11695e(r8, r4)
            goto L8
        L2d:
            boolean r1 = p270p6.C5368b.m11700j(r8, r4)
            goto L8
        L32:
            p270p6.C5368b.m11699i(r8, r0)
            k6.v r8 = new k6.v
            r8.<init>(r1, r3, r2)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p184k6.C3719v[] newArray(int r1) {
            r0 = this;
            k6.v[] r1 = new p184k6.C3719v[r1]
            return r1
    }
}
