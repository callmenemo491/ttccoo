package p124h7;

/* renamed from: h7.we */
/* loaded from: classes.dex */
public final class C2932we implements android.os.Parcelable.Creator<p124h7.C2914ve> {
    public C2932we() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2914ve createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = p270p6.C5368b.m11710t(r9)
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L3e
            int r5 = r9.readInt()
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r7 = 2
            if (r6 == r7) goto L39
            r7 = 3
            if (r6 == r7) goto L34
            r7 = 4
            if (r6 == r7) goto L2f
            r7 = 5
            if (r6 == r7) goto L26
            p270p6.C5368b.m11709s(r9, r5)
            goto L8
        L26:
            android.os.Parcelable$Creator<h7.oe> r4 = p124h7.C2788oe.CREATOR
            android.os.Parcelable r4 = p270p6.C5368b.m11694d(r9, r5, r4)
            h7.oe r4 = (p124h7.C2788oe) r4
            goto L8
        L2f:
            java.lang.String r3 = p270p6.C5368b.m11695e(r9, r5)
            goto L8
        L34:
            java.lang.String r2 = p270p6.C5368b.m11695e(r9, r5)
            goto L8
        L39:
            java.lang.String r1 = p270p6.C5368b.m11695e(r9, r5)
            goto L8
        L3e:
            p270p6.C5368b.m11699i(r9, r0)
            h7.ve r9 = new h7.ve
            r9.<init>(r1, r2, r3, r4)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2914ve[] newArray(int r1) {
            r0 = this;
            h7.ve[] r1 = new p124h7.C2914ve[r1]
            return r1
    }
}
