package p184k6;

/* renamed from: k6.l */
/* loaded from: classes.dex */
public final class C3709l implements android.os.Parcelable.Creator<p184k6.C3701d> {
    public C3709l() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p184k6.C3701d createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = p270p6.C5368b.m11710t(r9)
            r1 = 0
            r2 = 0
            r3 = -1
        L8:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L32
            int r5 = r9.readInt()
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r7 = 1
            if (r6 == r7) goto L2d
            r7 = 2
            if (r6 == r7) goto L28
            r7 = 3
            if (r6 == r7) goto L23
            p270p6.C5368b.m11709s(r9, r5)
            goto L8
        L23:
            long r3 = p270p6.C5368b.m11706p(r9, r5)
            goto L8
        L28:
            int r2 = p270p6.C5368b.m11705o(r9, r5)
            goto L8
        L2d:
            java.lang.String r1 = p270p6.C5368b.m11695e(r9, r5)
            goto L8
        L32:
            p270p6.C5368b.m11699i(r9, r0)
            k6.d r9 = new k6.d
            r9.<init>(r1, r2, r3)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p184k6.C3701d[] newArray(int r1) {
            r0 = this;
            k6.d[] r1 = new p184k6.C3701d[r1]
            return r1
    }
}
